package week2.day1;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();

        System.out.println("Welcome " + name);
    }
}
