package week2.day2;

public class findNthFibonacci {
    public static void main(String[] args){
        int num =50;
        
        System.out.println(fibonacci(num));
    }

    private static long fibonacci(int num) {
        if(num<=1){
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}

