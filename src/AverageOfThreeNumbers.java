import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static int average(int a, int b, int c){
        int avg = (a + b + c) / 3;

        System.out.println("The average of three numbers is: " + avg);
        return avg;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       int avgg = average(a, b ,c);
    }
}