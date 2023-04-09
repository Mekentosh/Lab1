import  java.util.Scanner;
public class Problem2 {
    public static double arrayAverage(int[] arr, int n) {
        // Базовый кейс:когда в массиве нет элементов
        if (n == 0) {
            return 0;
        }

        // Рекурсивный кейс: найти сумму элементов с индекса 0 по n-1
        // разделить на n, чтобы найти среднее значение
        double sum = arraySum(arr, n-1);
        return (sum + arr[n-1]) / n;
    }

    public static int arraySum(int[] arr, int n) {
        // когда в массиве нет элементов
        if (n == 0) {
            return 0;
        }

        // добавьте текущий элемент к сумме предыдущих элементов
        return arraySum(arr, n-1) + arr[n-1];
    }

}
