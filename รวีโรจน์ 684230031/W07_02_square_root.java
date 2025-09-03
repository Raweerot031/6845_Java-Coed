import java.util.Scanner;

public class W07_02_square_root {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // ประกาศตัวแปร Scanner ชื่อว่า kb
        System.out.println("Enter a number to find its square root");

        double x = kb.nextDouble(); // รับค่าที่ผู้ใช้กรอกเป็นเลขทศนิยม (double)

        if (x >= 0) {
            System.out.println("square root of" + x + " is" + Math.sqrt(x));
            System.out.println(Math.sqrt(x)); // แสดงผลค่ารากที่สอง
        } 
    }
}
