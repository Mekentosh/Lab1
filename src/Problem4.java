import  java.util.Scanner;
public class Problem4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }

}
