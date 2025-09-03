import java.util.Scanner;

public class W03_02_avaerage {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter number1 = ");
    int number1 = kb.nextInt();
    
    System.out.println("Enter number2 = ");
    int number2 = kb.nextInt();
    double average = (number1 + number2) /2 ;
    
    System.out.println("average =" + average );
    kb.close();
    }
    
}

