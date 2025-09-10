package Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array แบบที่ 1 ระบุสมาชิกในวงเล็บปีกกา
        String animals[] = {"Dog", "Cat", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float avsScore[] = {3.50f, 4.00f, 2.75f};

        // หาขนาด array
        System.out.println("Size of animals array : " + animals.length);
        
        // การเข้าถึงสมาชิก
        System.out.println("Animal at index 0: " + animals[0]);
        System.out.println("Animal at index 2: " + animals[2]);

        // วนลูปสมาชิก array avsScore
        System.out.println("Show all average scores : ");
        for (int i = 0; i < avsScore.length; i++) {
            System.out.println(avsScore[i]);  // แก้ไขจาก avgScore[i] เป็น avsScore[i]
        }

        //======================================================================
        // การประกาศตัวแปรแบบ Array แบบที่ 2 ระบุขนาดของ Array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";

        System.out.println("Size of colors array : " + colors.length);
        
        // แสดงผลสีใน colors
        int j = 1;
        System.out.println("Show all colors : ");
        for (int i = 0; i < colors.length; i++) {  // เปลี่ยนจาก avsScore เป็น colors
            System.out.println("Block : " + (i+1) + " : " + colors[i]);  // แก้ไข syntax ของ print
            //j++;
        }

        System.out.println("colors at index 0: " + colors[0]);
        System.out.println("colors at index 1: " + colors[1]);  // แก้ไขเป็น index 1

        //========================================================================
        // การใช้งาน array ของ integers
        int scores[] = new int[5];
        scores[0] = 50;

        System.out.println("Score at index 4: " + scores[4]);  // ผลลัพธ์ที่นี่จะเป็น 0 เพราะไม่ได้กำหนดค่าที่ index 4
    }
}
