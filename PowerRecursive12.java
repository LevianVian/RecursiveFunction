
import java.util.Scanner;

public class PowerRecursive12 {

    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            return 1; 
        }else {
            return base * calculatePower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Base Number: ");
        int base = input.nextInt();
        System.out.println("Input Power Number: ");
        int pow = input.nextInt();

        System.out.println("Result of "+base+" power "+pow+" = "+calculatePower(base, pow));

    }
}
