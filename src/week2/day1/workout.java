package week2.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class workout {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<100; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
       for(int j=0; j<20; j++){
           arrayList.remove(j);
       }
        System.out.println(arrayList.toArray()[5]);
    }
}
