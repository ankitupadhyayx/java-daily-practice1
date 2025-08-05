package recursion;
public class Recur_2 {
    static int fact(int num){
        if(num==1){
            return 1;
        }
        int smallResult=fact(num-1);
        return smallResult*num;
    }

    public static void main(String[] args) {
        int r = fact(5);
        System.out.println(r);
    }
}
//Write a recursive function to return the factorial of a given integer
