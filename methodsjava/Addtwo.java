package methodsjava;
import java.util.Scanner;
public class Addtwo {
        static void sum(){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter num1:");
            int num1 = sc.nextInt();
            System.out.print("enter num2:");  
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("sum is: " + sum);
            sc.close(); 
        }
    public static void main(String[] args) {
        sum();
    }
    
}
