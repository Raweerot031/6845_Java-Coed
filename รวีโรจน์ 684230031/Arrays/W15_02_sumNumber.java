package Arrays;
import java.util.Scanner;

public class W15_02_sumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a[] = new double[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = kb.nextDouble();
        }

        double sumAll = 0;
        double sumOdd = 0;
        double sumEven = 0;
        double average = 0;
        double max = a[0];
        double min = a[0];

        System.out.println("Show all numbers : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("index [" + i + "] value = " + a[i]);
            sumAll += a[i];  // คำนวณผลรวม
            if(a[i] % 2 != 0) {
            sumOdd += a[i];
            }else {
                sumEven += a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        // แสดงผลรวมของตัวเลขทั้งหมด
        System.out.println("Sum of all numbers = " + sumAll);
        System.out.println("Sum of Odd numbers = " + sumOdd);
        System.out.println("Sum of Even numbers = " + sumEven);

        average = sumAll / a.length;
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);
        System.out.println("Average of all numbers " + average);
        kb.close();
    }
}
