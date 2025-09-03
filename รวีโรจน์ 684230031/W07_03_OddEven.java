import java.util.Scanner;
public class W07_03_OddEven {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = kb.nextInt();
        
        int remain = n %2;
        
        if (remain == 0) {
            System.out.println("numbers" + n + "is Even");
        }else {
            System.out.println("numbers" + n + "is Odd");
        }
    }
}
