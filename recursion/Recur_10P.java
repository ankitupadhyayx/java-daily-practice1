package recursion;

import java.util.Scanner;

public class Recur_10P {
        static void Numberprint(int n ){
            if(n==0){
                return ;
            }
            Numberprint(n-1);
            System.out.println(n);
        }
        public static void main(String[] args){
            System.out.print("give num from 1 to N : N ?");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();

            Numberprint(m);
        }
    }
    //print linearly from 1 to n
    