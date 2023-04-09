import  java.util.Scanner;
public class Problem9 {
    public static int binomialCoefficient(int n, int k) {
        // Base cases: when k is 0 or n
        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case: use the formula C(n,k) = C(n-1,k-1) + C(n-1,k)
        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int coefficient = binomialCoefficient(n, k);
        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is " + coefficient);
    }
}

