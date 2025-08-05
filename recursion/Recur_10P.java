package recursion;

import java.util.Scanner;

public class Recur_10P {
        static void Numberprint(int i ,int n ){
            if(i>n){
                return ;
            }
            System.out.println(i);
            Numberprint(i+1,n);
        }
        public static void main(String[] args){
            System.out.print("give num from 1 to N : N ?");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Numberprint(1 , n);
        }
    }
    //print linearly from 1 to n
    