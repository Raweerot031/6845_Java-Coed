import java.util.Scanner;
public class W06_68_WH {
    public static void main(String[] args) {
        // สร้าง scanner เพื่อรับค่าจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
                //การคำนวณต้องใช้ int
         // รับจำนวนเงินที่เป็นจำนวนเต็ม
        int amount = scanner.nextInt();
// คำนวณจำนวนเหรียญ 10 บาท
        int tenBaht = amount / 10;     // หาจำนวนเหรียญ 10 บาท
        amount = amount % 10;           // หักออกจากจำนวนเงินที่เหลือ
    // คำนวณจำนวนเหรียญ 5 บาท
        int fiveBaht = amount / 5;  // หาจำนวนเหรียญ 5 บาท
        amount = amount % 5;        // หักออกจากจำนวนเงินที่เหลือ
// คำนวณจำนวนเหรียญ 1 บาท
        int oneBaht = amount;    // เหลือจำนวนเงินทั้งหมดคือเหรียญ 1 บาทs
    
    // แสดงผลลัพธ์
        System.out.println("เหรียญ 10 บาท: " + tenBaht + " เหรียญ");
        System.out.println("เหรียญ 5 บาท: " + fiveBaht + " เหรียญ");
        System.out.println("เหรียญ 1 บาท: " + oneBaht + " เหรียญ");
    }
}