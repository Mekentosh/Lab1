# Assignemt1 
###  by Muratbek Meirzhan


---


# Main 🗿 [Link](src/Main.java)

The Main class is created to call each class by using Scanner and methods (switch-case)

```import  java.util.Scanner;
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
   ```   


---


# Problem:one: [Link](src/Problem1.java)
Description: This function returns minimum value of the array by using recursive function

Explanation:

1. The main method initializes an integer array arr with five values.

2. it then calls the findMin method with two arguments: arr and the length of the array (arr.length).

3. The findMin method is a recursive function that takes an array and its length as arguments.

4. If the length of the array is 1, the method returns the only element in the array as the minimum value.

5. Otherwise, it recursively calls itself with the array and its length minus one and stores the returned minimum value in the min variable.

6. Finally, it returns the minimum value between min and the last element in the array (arr[n-1]) using the Math.min method.
 
7. The main method prints the minimum value found by the findMin method.


```
public class Problem1 {
    public static void main() {
        int[] arr = {10,32,7,3,5};
        int min = findMin(arr,arr.length);
        System.out.println("Min from arr is:"+ min +" " + arr.length);
    }
    public static int findMin(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMin(arr,n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}

```


---


