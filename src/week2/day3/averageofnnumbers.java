package week2.day3;

import java.util.Scanner;

public class averageofnnumbers {
    //calculate average of n numbers in array
    /*
    public static void main(String[] args){
        double[] array = new double[]{1,4,5,7,9,5,3,75,12,45,7,5,7,8,5,1,755};
        int total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        System.out.println("The average is : " + total/array.length);
    }
     */

    //calculate array by taking individual numbers
    public static void main(String[] args){
        float total = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of input you like to provide : ");
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Enter num " + i + " : ");
            float number = in.nextInt();
            total += number;
        }

        System.out.println("THe average of numbers entered is : " + (total / n));
    }

}
