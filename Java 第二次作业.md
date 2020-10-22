## 6.4 反向显示一个整数

```java
import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user enter the number
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // reverse the number
        reverse(num);
    }

    public static void reverse(int number) {
        String s = "";
        while (number != 0) {
            s += number % 10;
            number /= 10;
        }
        System.out.println(s);
    }
}
```

![image-20201022090445969](D:\master\grade1\1. 算法，Java，POJ\Java课\screenshots\image-20201022090445969.png)

***



## 6.17 显示0和1构成的矩阵

```java
import java.util.Scanner;

public class printMat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        // print matrix
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        int [][] matrix = new int[n][n];
        // generate random 0 or 1
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++) {
                matrix[row][col] = (Math.random() > 0.5) ? 1 : 0;
            }
        }
        // print
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
```

![image-20201022092301978](D:\master\grade1\1. 算法，Java，POJ\Java课\screenshots\image-20201022092301978.png)

***



## 7.7 统计一位数的个数

```java
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number: ");
        int n = input.nextInt();
        printCount(n);
    }

    public static void printCount(int n) {
        int[] counts = new int[10];
        // generate numbers between 0 and 9
        for (int i = 0; i < n; i++) {
            int x;
            x = (int)(Math.random() * 10);
            counts[x]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Number %d appears %d times.\n", i, counts[i]);
        }
    }
}
```

![image-20201022094314455](D:\master\grade1\1. 算法，Java，POJ\Java课\screenshots\image-20201022094314455.png)

***



## 7.10 找出最小元素下标

```java
import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] nums = new double[10];
        for (int i = 0; i < 10; i++)
            nums[i] = input.nextDouble();
        int idx;
        idx = indexOfSmallestElement(nums);
        System.out.printf("The index of smallest element is %d.\n", idx);
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
```

![image-20201022100101692](D:\master\grade1\1. 算法，Java，POJ\Java课\screenshots\image-20201022100101692.png)

***



## 8.2 求矩阵主对角元素的和

```java
import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix: ");
        int n = input.nextInt();
        System.out.printf("Enter a %d-by-%d matrix row by row: \n", n, n);

        double[][] matrix = new double[n][n];

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++)
                matrix[row][col] = input.nextDouble();
        }

        double res;
        res = sumMajorDiagnal(matrix);
        System.out.printf("Sum of the elements in the major diagonal is %f.\n", res);
    }

    public static double sumMajorDiagnal(double[][] m) {
        double ans = 0.0;
        for (int i = 0; i < m.length; i++) {
            ans += m[i][i];
        }
        return ans;
    }
}
```

![image-20201022105026566](D:\master\grade1\1. 算法，Java，POJ\Java课\screenshots\image-20201022105026566.png)
