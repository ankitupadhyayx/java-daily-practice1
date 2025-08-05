//Print table using recursion 
package recursion;

public class Recur_8 {
    static void printTable(int n , int i){
        if(i==0){
            return;// exit from the function call
        }
        printTable(n,i-1);
        //backtrack

        System.out.println(n+" x "+ i + "= " +n*i);
    }

    public static void main(String[] args) {
        printTable(5,12);
    }
}
