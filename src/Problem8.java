import  java.util.Scanner;
public class Problem8 {
    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isAllDigits(s)) {
            System.out.println("The string consists of only digits.");
        } else {
            System.out.println("The string does not consist of only digits.");
        }
    }
}
