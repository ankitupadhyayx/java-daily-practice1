package loops;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of line:");
    int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (n*2 - (2*i-1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
// *********
//  *******
//   *****
//    ***
//     *
// n=5