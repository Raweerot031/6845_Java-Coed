import java.util.Scanner;
public class W09_02_BMI {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter weight (kg): ");
    double weight = kb.nextDouble();
    System.out.print("Enter height (m): ");
    double height = kb.nextDouble();
    
    double bmi = weight / (height/100) * (height/100);
    System.out.println("You BMI is: " + bmi);

    if(bmi > 40){
        System.out.println("โรคอ้วน ระดับ 3");
    }else if(bmi >=35) {
        System.out.println("โรคอ้วน ระดับ 2");
    }else if(bmi >=30) {
        System.out.println("โรคอ้วน ระดับ 1");
    }else if(bmi >=25) {
        System.out.println("น้ำหนักเกิด");
    }else if(bmi >=18.5) {
        System.out.println("น้ำหนักปกติ");
    }else{
        System.out.println("น้ำหนักน้อย / ผอม");
    }
        
    
    
    
    
    
    
    
    kb.close();
    }
}







 // สูตรคำนวณ BMI
 // BMI = น้ำหนัก (กก.) / (ส่วนสูง (ม.)* ส่วนสูง (ม) )