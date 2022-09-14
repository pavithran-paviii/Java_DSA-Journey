package week2.day5;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a input : ");
        int num = in.nextInt();
        int numcopy = num;
        int output = 0;

        while (numcopy>0){
            int lastno = numcopy % 10;
            output += Math.pow(lastno,3);
            numcopy /= 10;
        }

        if(output == num){
            System.out.println("Given number is armstrong number " + num);
        }else{
            System.out.println("Given number is not a armstrong number " + num);
        }
    }
}
