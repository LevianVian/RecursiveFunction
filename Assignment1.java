import java.util.Scanner;

public class Assignment1 {

    static void recursive(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.print(n + " "); 
            recursive(n - 1);     
        }
    }

    static void iterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number (n): ");
        int n = input.nextInt();

        System.out.println("Recursive Result");
        recursive(n);

        System.out.println("\nIterative Result");
        iterative(n);
    }
}