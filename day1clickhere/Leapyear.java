package day1clickhere;


import java.util.Scanner;

<<<<<<< HEAD
public class Leapyear {
=======
public class Leapyear add {
>>>>>>> 5f16199d6a74e28290e958dd8ae14756abf10e05
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year ");
        int y = sc.nextInt();
        if(y%100!=0&&y%4==0 || y%400==0){
            System.out.println("this is leap year");
        }
        else {
            System.out.println("not a leap year");
        }

    }
}
