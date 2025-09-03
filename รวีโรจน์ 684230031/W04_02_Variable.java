public class W04_02_Variable {
    public static void main(String[] args) {
       // ประกาศตัวแปรชนิดข้อมูล
        byte a;
        byte b;

        // กำหนดค่าให้กับตัวแปร
        a = 10; // กำหนดค่า10 ให้ a
        b = 20; // กำหนดค่า20 ให้ b
        
        // รวมตัวแปรที่ประกาศไว้แล้วอยู่ในบรรทัดเดียวกันได้
        byte aa, bb;// a และ b เป็นชนิดข้อมูล byte
        byte aaa = 0, bbb = 0;// a,b; // ประกาศตัวแปร a และ b เป็นชนิด byte และกำหนดค่าเป็น 0

        //ประกาศตัวแปรและชนิดข้อมูล พร้อมกับการกำหนอค่า
    short c = 30; // กำหนดค่า30 ให้ c
    
    int ch = '\u0044'; //กำหนดค่า 68 (ASCII ของ 'D')ให้กับตัวแปร ch
    System.out.println("ch");

    String ch1 = "\u0044";
    System.out.println(ch1);

    char ch2 = '\u0044';
    System.out.println(ch2);
    
    int var1 = 014;
    System.out.println(var1);
    
    double var2 = 014f;
    System.out.println(var2);
    
    double var4 = 0E-0;
    System.out.println(var4);
    
    String var9 = null;
    System.out.println(var9);
    
    boolean var10 = true;
    System.out.println(var10);
    
    boolean var11 = 2>3;
    System.out.println(var11);
    
    
    
    }
}
