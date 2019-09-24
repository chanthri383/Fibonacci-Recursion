import java.util.*;

public class Main
{
    public static int counter = 0;
    public static int firstValueToAdd = 0;
    public static int secondValueToAdd = 1;
    public static int sum = firstValueToAdd + secondValueToAdd;
    static void fibo(int max)
    {
        if(max <= 0)
        {
            System.out.println("Fibonacci 0 as sum is 0");
            return;
        }
        if(counter > max) //base case
        {
            System.out.println("Stopping point");
            return;
        }
        fibo(max - 1);
        System.out.println("Fibonacci " + max + " as sum is " + sum);
        secondValueToAdd = firstValueToAdd;
        firstValueToAdd = sum;
        sum = firstValueToAdd + secondValueToAdd;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = 0;
        System.out.println("Please enter the upper limit for Fibonacci: ");
        input = scan.nextInt();
        fibo(input);
    }
}
