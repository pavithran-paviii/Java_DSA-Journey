package week2.day1;

import java.util.Scanner;

public class armstrongNumberBetweenTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();

        for(int i=num1; i<num2; i++){
            armStrong(i);
        }
    }

    static void armStrong(int num){
        int inputNum = num;
        int total = 0;

        while(num>0){
            int cube = num % 10;
            total = total + cube * cube * cube;
            num = num / 10;
        }

       if(inputNum == total){
           System.out.println(total);
       }
    }
}
