import  java.util.Scanner;
public class Problem3 {public static boolean isPrime(int n) {
    if (n < 2) {  // числа меньше 2 не являются простыми
        return false;
    }
    return isPrimeHelper(n, 2);
}

    private static boolean isPrimeHelper(int n, int i) {
        if (i > Math.sqrt(n)) {  // проверить делимость до квадратного корня из n
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrimeHelper(n, i + 1);
    }


}
