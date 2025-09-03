package Loop;

import java.util.Scanner;

public class W11_03_While_True_ChopseMenu_SwitchCase {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // โจทย์
        // 1 ให้บวกเลข 2จำนวน
        // 2 ให้ลบเลข 2จำนวน
        // 3 ให้อกกจากเโปรแกรม 2จำนวน
        //====================================================
        //แสดงข้อความรับตัวเลข 2 ตัว

        System.out.print("Enter Numbers 1");
        int num1 = kb.nextInt();
        System.out.print("Enter Numbers 2");
        int num2 = kb.nextInt();

        //====================================================
        // แสดงเมนูเพื่อรับ choice
        System.out.println("================================================== ");
        System.out.println("Menu: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("================================================== ");

        while (true) {
            System.out.println("Enter your choice: ");
            int choice = kb.nextInt();
            System.out.println("------------------------------------------");

            switch (choice) {
                case 1:
                    int result = num1 + num2;
                    System.out.println("Addition Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                //default:
                // System.out.println("Invalid choie. Please try agrs");

            }
            if (choice == 1) {
                int result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;
            } else if (choice == 2) {
                int result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
