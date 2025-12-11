import java.util.Scanner;

public class PowerRecursive12 {

    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            System.out.print("1");
            return 1; 
        } else {
            System.out.print(base + "x"); 
            return base * calculatePower(base, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int pow = input.nextInt();

        System.out.print("Result of " + base + " power " + pow + " = ");

        int result = calculatePower(base, pow);
        
        System.out.println(" = " + result);
    }
}