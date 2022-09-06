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
        int i =0;

        while(i<length/2){
            Character begining = in.charAt(i);
            Character end = in.charAt(length - i - 1);
           if(!begining.equals(end)){
               System.out.println(in + " is not a palindrome");
               return;
           }
            i++;
        }

        System.out.println(in + " is palindrome");
    }
}
