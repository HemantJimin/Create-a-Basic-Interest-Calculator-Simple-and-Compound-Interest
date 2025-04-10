import java.util.Scanner;

public class TEXT{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (% per year): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter Number of Times Interest is Compounded per Year: ");
        int n = scanner.nextInt();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate Compound Interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest
    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        return principal * Math.pow((1 + (rate / (100 * n))), n * time) - principal;
    }
}