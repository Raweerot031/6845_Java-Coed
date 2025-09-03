import java.util.Scanner;

public class W07_04_aboutCircie {
    public static void main(String[] args) {
        // ต้องการให้ผู้ใช้เลือกคำนวณอะไรกับวงกลม
        // สิ่งที่ต้องใช้คือ รัศมี (radius)
        // เส้นรอบวง = 2 * pi * r
        // พื้นที่ = pi * r^2

        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่รัศมี (radius): ");
        double radius = scanner.nextDouble();

        System.out.println("เลือกคำนวณเกี่ยวกับวงกลม");
        System.out.println("1. พื้นที่");
        System.out.println("2. เส้นรอบวง");
        System.out.print("กรุณาเลือก (1 หรือ 2): ");
        int choice = scanner.nextInt();

        // ตรวจสอบตัวเลือกของผู้ใช้ และคำนวณตามที่เลือก
        if (choice == 1) {
            double area = PI * radius * radius;
            System.out.println("พื้นที่ของวงกลมคือ: " + area);
        } else if (choice == 2) {
            double circumference = 2 * PI * radius;
            System.out.println("เส้นรอบวงของวงกลมคือ: " + circumference);
        } else {
            System.out.println("กรุณาเลือกเฉพาะ 1 หรือ 2 เท่านั้น");
        }

    }
}
