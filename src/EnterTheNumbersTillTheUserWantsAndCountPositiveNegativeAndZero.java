import java.util.Scanner;

public class EnterTheNumbersTillTheUserWantsAndCountPositiveNegativeAndZero {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number, positive = 0, negative = 0, zero = 0;

        char choice;

        do {
            System.out.println("Enter the number ");
            number = inp.nextInt();

            if(number > 0){
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Do you want to continue y/n ? ");
            choice = inp.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
    }
}
