public class Main {
    static int[] amounts = new int[100];
    static String[] borrowers = new String[100];
    static boolean[] isPaid = new boolean[100];
    static double[] interestRates = new double[100];
    static int loansCount = 0;

    public static void addLoan(String borrower, int amount, double interestRate) {
        borrowers[loansCount] = borrower;
        amounts[loansCount] = amount;
        interestRates[loansCount] = interestRate;
        loansCount++;
    }

    public static void setAsPaid(String borrower) {
        for (int i = 0; i < loansCount; i++) {
            if (borrowers[i].equals(borrower)) {
                isPaid[i] = true;
            }
        }
    }

    public static void listLoans() {
        for (int i = 0; i < loansCount; i++) {
            if (!isPaid[i]) {
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 100, 0.1);
        addLoan("Ben Chee", 50, 0.2);
        addLoan("Chris Davis", 30, 0.3);
        setAsPaid("Ben Chee");
        listLoans();
    }
}
