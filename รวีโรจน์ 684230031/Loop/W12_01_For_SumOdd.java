package Loop;

import java.util.Scanner;

public class W12_01_For_SumOdd {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a Start number:");
        int start = kb.nextInt();
        System.out.print("Enter a Stop number:");
        int stop = kb.nextInt();

        while (start >= stop) {
            System.out.println("Start num must be less than Stop num.");
            System.out.print("Enter a Start number:");
            start = kb.nextInt();
            System.out.print("Enter a Stop number:");
            stop = kb.nextInt();
        }

        int sum = 0; // ตัวแปรรับผลรวม
        int i = 1;
        if (start < stop) {
            for (int count = start; count <= stop; count++) {
                System.out.println("รอบที่ " + i + ":" + sum + "+" + count + "=" + (sum +
                        count));
                sum = sum + count;
                i++;
            }
            // } else {
            // System.out.println("Start num must be less than Stop num.");
            // }
        }
    }
}
