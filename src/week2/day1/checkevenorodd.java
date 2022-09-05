package week2.day1;

import java.util.Scanner;

public class checkevenorodd {
    public static void main(String[] args){
        oddoreven();
    }

    static void oddoreven(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number here : ");
        int inputt = input.nextInt();
        if(inputt % 2 == 0){
            System.out.println(inputt + " is even");
        }else{
            System.out.println(inputt + " is odd");
        }
    }
}
