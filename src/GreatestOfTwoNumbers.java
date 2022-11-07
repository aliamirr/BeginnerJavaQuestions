import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void gratestNumber(int a, int b){
        if(a > b){
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       // int grtNum =
        gratestNumber(a ,b);
    }
}
