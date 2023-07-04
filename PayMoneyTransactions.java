import java.util.Scanner;

public class PayMoneyTransactions {
    public static int findTargetTransaction(int[] transactions, int target) {
        int total = 0;
        for (int i = 0; i < transactions.length; i++) {
            total += transactions[i];
            if (total >= target) {
                return i + 1;  // Return the transaction index (1-based)
            }
        }
        return -1;  // Target not achieved
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Case 1
        System.out.print("Enter the size of transaction array: ");
        int size = scanner.nextInt();
        int[] transactions = new int[size];

        System.out.println("Enter the values of array:");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        System.out.println("Enter the values of targets:");
        for (int i = 0; i < numTargets; i++) {
            int target = scanner.nextInt();
            int transactionIndex = findTargetTransaction(transactions, target);
            if (transactionIndex == -1) {
                System.out.println("Target " + target + " is not achieved");
            } else {
                System.out.println("Target " + target + " is achieved after " + transactionIndex + " transactions");
            }
        }

        // Test Case 2
        System.out.print("Enter the size of transaction array: ");
        size = scanner.nextInt();
        transactions = new int[size];

        System.out.println("Enter the values of array:");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.print("Enter the total number of targets that need to be achieved: ");
        numTargets = scanner.nextInt();

        System.out.println("Enter the values of targets:");
        for (int i = 0; i < numTargets; i++) {
            int target = scanner.nextInt();
            int transactionIndex = findTargetTransaction(transactions, target);
            if (transactionIndex == -1) {
                System.out.println("Target " + target + " is not achieved");
            } else {
                System.out.println("Target " + target + " is achieved after " + transactionIndex + " transactions");
            }
        }

        scanner.close();
    }
}
