import java.util.Scanner;

public class Assignment2 {

    static int summationRecur(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + summationRecur(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number (n): ");
        int n = input.nextInt();

        System.out.print("Result: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }

        int result = summationRecur(n);

        System.out.println(" = " + result);
    }
}