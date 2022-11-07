import java.util.Scanner;

public class EighteenOrNot {

    public static void eighteen(int age){
        if(age >= 18){
            System.out.println("The person of age " + age + " is eligible to vote.");
        } else {
            System.out.println("The person of age " + age + " is not eligible to vote. ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        // int grtNum =
        eighteen(age);
    }
}

