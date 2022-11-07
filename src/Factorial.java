import java.util.Scanner;

public class Factorial {

    static int factorial2(int n){
        if(n == 0)
            return  1;
        else
            return (n*factorial2(n-1));
    }

    public static void main(String[] args) {
        int fact, num;

        System.out.println("Enter the number: ");

        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();

        fact = factorial2(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }

}

