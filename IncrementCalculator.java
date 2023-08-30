import java.util.Scanner;

public class IncrementCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your rating (1, 2, or 3): ");
        int rating = scanner.nextInt();

        double incrementPercentage = calculateIncrement(rating);
        double incrementAmount = salary * (incrementPercentage / 100.0);
        double newSalary = salary + incrementAmount;

        System.out.println("Increment Percentage: " + incrementPercentage + "%");
        System.out.println("Increment Amount: " + incrementAmount);
        System.out.println("New Salary: " + newSalary);

        scanner.close();
    }

    public static double calculateIncrement(int rating)
    {
        double incrementPercentage;

        if (rating == 1) {
            incrementPercentage = 75.0;
        } else if (rating == 2) {
            incrementPercentage = 50.0;
        } else if (rating == 3) {
            incrementPercentage = 25.0;
        } else {
            incrementPercentage = 0.0;
            System.out.println("Invalid rating!");
        }

        return incrementPercentage;
    }
}


