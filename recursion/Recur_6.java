//Print numbers from 1 to N (increasing)
package recursion;

public class Recur_6 {
    public static void printInc(int n ){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n+ " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
}