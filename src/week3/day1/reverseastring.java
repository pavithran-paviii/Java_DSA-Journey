package week3.day1;

import java.util.Scanner;

public class reverseastring {
    public static void main(String[] args){

        Scanner in =new Scanner(System.in);

        System.out.print("Enter a string to reverse : ");
        String str = in.next();
        String output = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            output = ch + output;
        }

        System.out.println("The reversed string is " + output);
    }
}
