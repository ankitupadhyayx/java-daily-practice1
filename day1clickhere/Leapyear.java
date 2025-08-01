package day1clickhere;


import java.util.Scanner;

public class Leapyearit add {
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
