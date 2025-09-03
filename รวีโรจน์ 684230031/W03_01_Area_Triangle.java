import java.util.Scanner;
public class W03_01_Area_Triangle{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // สร้างอ็อบเจกต์ scanner เพื่อรับข้อมูล
        System.out.print("Enter height = ");
        int height = kb.nextInt();
        System.out.println("Enter base = ");
        int base = kb.nextInt();
        double area = 0.5*base* height;      // หรือใส่ข้อมูลเป็น float ก็ได้
        System.out.println("Area of Triangle = " + area);
        kb.close(); // ปิดอ็อกเจกต์ scanner
    }
}