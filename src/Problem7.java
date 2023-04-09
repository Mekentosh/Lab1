import  java.util.Scanner;
public class Problem7 {
    public static void reverseArray(int[] arr, int start, int end) {
        // base case: if the array has zero or one element, return
        if (start >= end) {
            return;
        }

        // reverse the subarray from index start+1 to end
        reverseArray(arr, start+1, end);

        // swap the first and last elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        reverseArray(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

