package week2.day2;

import java.util.Scanner;

public class factorsofanumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a input : ");
        int num = in.nextInt();

        for(int i=1 ; i<=num; i++){
            if(num % i == 0){
                System.out.print(i + ",");
            }
        }
    }
}
