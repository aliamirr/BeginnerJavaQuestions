//public class PowerOfNumber {
//    public static void main(String[] args) {
//        int base = 3, exponent = 4;
//        long result = 1;
//
//        while(exponent != 0) {
//            result = result * base;
//            --exponent;
//        }
//        System.out.println("Answer = " + result);
//    }
//}

//public class PowerOfNumber {
//    public static void main(String[] args) {
//        int base = 3;
//        long result = 1;
//
//        for(int exp = 4; exp != 0; exp--){
//            result = result * base;
//        }
//        System.out.println("Answer = " + result);
//    }
//}

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3, exponent = -4;
        double result = Math.pow(base, exponent);
        System.out.println("Answer = " + result);
    }
}