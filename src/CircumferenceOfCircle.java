import java.util.Scanner;

public class CircumferenceOfCircle {

    public static float circumference(int r){
        float circ = 2 * (22/7f) * r;
        System.out.println("The Circumference of circle for given radius is: ");
        return circ;
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();

        float circc = circumference((int) r);
    }
}
