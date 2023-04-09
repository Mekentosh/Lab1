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
# Problem:two: [Link](src/Problem2.java)

Description: This function getting the average of each value of the array.

```
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

```
---


# Problem:three: [Link](src/Problem3.java)

Description: This function decides whether a number is Prime or Composite.
```
import  java.util.Scanner;
public class Problem3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}

```

---
# Problem:four: [Link](src/Problem4.java)

Description: This function finding factorial of given value.
```
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

```

---
# Problem:five: [Link](src/Problem5.java)

Description: This function getting fibonacci of given value.

```
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
```

---
# Problem:six: [Link](src/Problem6.java)
Description: This function finds a in power of n.
```
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
```

---
# Problem:seven: [Link](src/Problem7.java)

Description: This function reversing the array.
```
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
```

---
# Problem:eight: [Link](src/Problem8.java)

Description: This function checks is user input contains letter's
```import  java.util.Scanner;
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
```

---
# Problem:nine: [Link](src/Problem9.java)

Description: This function solve binomial coefficient.
```
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
```

---
# Problem:one::zero: [Link](src/Problem10.java)

Description: This function finds Greatest Common Divisor of given 2 number's.

```
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
```
