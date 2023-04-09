import  java.util.Scanner;
    public class Problem6 {
        public static void main(String[] args) {
            //get input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            System.out.print("Enter the power: ");
            int power = scanner.nextInt();

            // Calculate power using the power method
            double result = power(num, power);

            // Print the result
            System.out.println(num + " raised to the power of " + power + " is " + result);
        }

        public static double power(double a, int n) {
            if (n == 0) { // base case: a^0 = 1
                return 1;
            } else if (n % 2 == 0) { // if n is even, a^n = (a^(n/2))^2
                double temp = power(a, n / 2);
                return temp * temp;
            } else { // if n is odd, a^n = a * a^(n-1)
                return a * power(a, n - 1);
            }
        }
    }




