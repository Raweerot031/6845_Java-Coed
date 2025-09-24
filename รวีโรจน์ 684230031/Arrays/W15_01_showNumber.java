package Arrays;

public class W15_01_showNumber {
    public static void main(String[] args) {
        int num [] = new int[100];
        for (int i=0 ;i<num.length ; i++ ){
            num[i] = i+24;
            System.out.println("positon [" + i + "]= " + num[i]);
            
        }

        int x = num[49];
        
        
        System.out.println("========================================");
        System.out.println("num at end positiom =" + num[24]);
        System.out.println("num at end positiom =" + num[99]);
    }
}