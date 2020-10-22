## Java 第一次作业



### 2.2  

```java
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double area;
        double vol;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double side = input.nextDouble();
        double height = input.nextDouble();
        area = sqrt(3) / 4 * side * side;
        vol = area * height;
        System.out.println(area);
        System.out.println(vol);
    }
}
```

![](D:\master\grade1\1. 算法，Java，POJ\Java课\微信截图_20200930171816.png)

------











### 2.6

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        int quotient = number;
        int remainder = 1;
        while (quotient != 0) {
            remainder *= (quotient % 10);
            quotient /= 10;
        }
        System.out.printf("The multiplication of all digits in 999 is %d", remainder);
    }
}
```

![](D:\master\grade1\1. 算法，Java，POJ\Java课\微信截图_20200930172007.png)

------















### 2.7

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minute = input.nextInt();
        
        int day = minute / (60 * 24);
        int year = day / 365;
        day %= 365;
        System.out.printf("%d minutes is approximately %d years and %d days", minute, year, day);
    }
}
```

![](D:\master\grade1\1. 算法，Java，POJ\Java课\微信截图_20200930172132.png)

------





















### 2.13

```java
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        int money = input.nextInt();

        double rate = 0.003125;
        double value = 0.0;
        for (int i = 1; i <= 6; i++) {
            value = (money + value) * (1 + rate);
            System.out.printf("After the %d mouth, the account value is %.11f \n", i, value);
        }
    }
}
```

![](D:\master\grade1\1. 算法，Java，POJ\Java课\微信截图_20200930172300.png)

------



















### 2.14

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        height *= 0.0254;
        weight *= 0.45359237;
        double BMI = weight / height / height;
        System.out.printf("BMI is %.4f ", BMI);
    }
}
```

![](D:\master\grade1\1. 算法，Java，POJ\Java课\微信截图_20200930172402.png)