import java.util.Scanner;

public class Assignment3 {
    static boolean isPrimeRecur(int n, int divisor) {
    
        if (n <= 1) {
            return false;
        }
        
        if (divisor == 1) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return isPrimeRecur(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number (n): ");
        int n = input.nextInt();

        if (isPrimeRecur(n, n - 1)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
}