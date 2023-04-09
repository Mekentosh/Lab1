import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Problem1.main();
                break;
            case 2:
                Problem2.main(); {

            }

            break;
            case 3:
                Problem3.main(args);
                break;
            case 4:
                Problem4.main(args);
                break;
            case 5:
                Problem5.main(args);
                break;
            case 6:
                Problem6.main(args);
                break;
            case 7:
                Problem7.main(args);
                break;
        }

    }
    }