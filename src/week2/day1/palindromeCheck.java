package week2.day1;

import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args){
        isPlaindrome();
    }

    static void isPlaindrome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String in = input.next();

        int length = in.length();
//        System.out.println(length);
        int i =0;

        while(i<length/2){
//            System.out.println(in.charAt(i));
//            if(in.charAt(i).equals(in.charAt(length - i - 1)))

            i++;
        }
//        System.out.println("true");
    }
}
