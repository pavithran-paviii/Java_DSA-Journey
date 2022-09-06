package week2.day2;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = in.nextDouble();

        System.out.println("The area of circle is " + Math.PI * Math.pow(radius , 2));
    }
}
