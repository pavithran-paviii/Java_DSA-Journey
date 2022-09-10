package week2.day4;

import java.util.Scanner;

public class distancebetweentwopoints {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter X1 : ");
        int x1 = in.nextInt();

        System.out.print("Enter X2 : ");
        int x2 = in.nextInt();

        System.out.print("Enter Y1 : ");
        int y1 = in.nextInt();

        System.out.print("Enter Y2 : ");
        int y2 = in.nextInt();

        double output =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.println("Distance between two point is : " + output);
    }
}
