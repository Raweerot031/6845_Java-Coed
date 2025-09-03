import java.util.Scanner;
public class W05_01_inputData {
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); 
    System.out.println("Enter Value A: ");
    int a = kb.nextInt();
    
    System.out.println("Enter Value B: ");
    int b = kb.nextInt();
    
    System.out.println("Before : Output of Value A = " + a );
    System.out.println("Before : Output of Value B = " + b);
    // Swap values
    int temp = a;
    a = b;
    b = temp;
    
    System.out.println("Before : Output of Value A = " + a );
    System.out.println("Before : Output of Value B = " + b );
    
    int x = 6;
    System.out.println(x-- + ++x - --x - x-- + x++ + x);

    int a = 21;
    intb = 0;
    System.out.println("a" + (a - b) );

    double x = 1.0; 
    double y = 1.000;
    System.out.println(x > y);

    double x = 1.6; a + = 5.1;
    System.out.println(a %4);

    
    }
}