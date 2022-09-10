package week2.day4;

import java.util.Scanner;

public class battingaverage {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter batsman total run : ");
        double totalruns = in.nextInt();

        System.out.print("Enter no of times out : ");
        int totalout = in.nextInt();

        /*
        formula to calulate average runs -> totalruns / totaltimesout
         */

        System.out.println("The average run is " + totalruns / totalout);
    }
}
