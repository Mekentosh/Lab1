import  java.util.Scanner;
public class Problem10 {
    public static int gcd(int a, int b) {
        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive case: find the GCD of b and the remainder of a divided by b
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
    }
}
