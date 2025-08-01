package day1clickhere;
import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write 3 values to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b  &&  a>c){
            System.out.println(" a is great");
        } else if (b>c) {
            System.out.println("b is great");
        }else{
            System.out.println("c is great");
        }

    }
}
