import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter number of values: ");
        n = sc.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative number entered: " + num);
                }

                sum += num;
            }

            double avg = sum / n;
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
