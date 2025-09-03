import java.util.Scanner;

public class W09_01_calclategrad {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("กรุณาใส่คะแนน");
    byte score = kb.nextByte();
    if(score > 0 && score < 100)
    if(score >= 80) {
        System.out.println("A");
    }else if( score >= 70){
        System.out.println("B");
    }else if( score >= 60){
        System.out.println("C");
    }else if(score >= 50){
        System.out.println("D");
    }else {
        System.out.println("F");
    }else {
        System.out.println("ข้อผิดพลาด: คะแนนต้องอยู่ระหว่าง 0 ถึง 100");
    }
}
}
