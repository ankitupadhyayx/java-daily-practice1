package day1clickhere;

import java.util.Scanner;
public class LargenumUsingNestedifelse {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Give num 1 = ");
            int a = sc.nextInt();
            System.out.print("Give num 2 = ");
            int b = sc.nextInt();
            System.out.print("Give num 3 = ");
            int c = sc.nextInt();
            if (a>=b) {
                if (a >= c) {
                    System.out.println("a is great");
                } else {
                    System.out.println("c is great");
                }
            }

            else{
                if(b>=c){
                    System.out.println("b is great");
                }
                else{
                    System.out.println("c is great ");
                }
            }

        }
    }
