import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Product Name = ");
        String Name = kb.nextLine();
        System.out.print("Enter Price: ");
        int Price = kb.nextInt();
        System.out.print("Enter Quantity: ");
        int Quantity = kb.nextInt();

        double baht = Price * Quantity;
        System.out.println("Subtotal = " + baht);


    }
}
