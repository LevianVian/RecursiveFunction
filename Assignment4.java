import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month number to calculate total pairs: ");
        
        if (scanner.hasNextInt()) {
            int targetMonth = scanner.nextInt();
            
            if (targetMonth < 1) {
                System.out.println("Please enter a month number greater than 0.");
            } else {
                System.out.println("Calculating...");
                int totalPairs = calculatePairs(targetMonth);
                System.out.println("Total pairs at the end of month " + targetMonth + ": " + totalPairs);
            }
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }
        
        scanner.close();
    }

    public static int calculatePairs(int month) {
        if (month <= 2) {
            return 1;
        }
        return calculatePairs(month - 1) + calculatePairs(month - 2);
    }
}