package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int n = 5, n1 = 0, n2 = 1;
        System.out.print("First " + n + " numbers: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + "  ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
