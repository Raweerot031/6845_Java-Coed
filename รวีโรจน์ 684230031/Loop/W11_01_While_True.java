package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        // เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่องๆ จนกระทั่งกดเบอร์ 9 จึงหยุด
        
            Scanner kb = new Scanner(System.in);
            while(true){
//  NO. 1 เขียนโปรแกรมรับเลจจากตัวเลข
        // System.out.print("Enter Number: ");
        // int num = kb.nextInt();

        // if(num == 9) { //คำสั่งที่ตรวบสอบการออกจากลูป
        // break; // คำสั่งที่ใช้ในการออกจากลูป
        //     }
        
//  NO.2 เขียนโปรแกรมรับตัวอักษรจากคีย์บอร์ด จนถึง "e"     
        System.out.println("Enter Alphabet: ");
        String alphabet = kb.nextLine();
        if(alphabet.equals("e") ) {
            break;
        }
        
        }
    
    }

}
