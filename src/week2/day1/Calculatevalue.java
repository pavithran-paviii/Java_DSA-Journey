package week2.day1;

import java.util.Scanner;

public class Calculatevalue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter no 2 : ");
        int num2 = input.nextInt();
        System.out.print("Enter operator : ");
        String operator = input.next();

        if(operator.equals("+")){
            System.out.println(num1 + num2);
        }else if(operator.equals("-")){
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }else if (operator.equals("/")){
            System.out.println(num1 / num2);
        }else{
            System.out.println(num1 % num2);
        }
    }
}
