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
<<<<<<< HEAD
//Write a recursive function to return the factorial of a given integer
=======
//Write a recursive function to return the factorial of a given integer
>>>>>>> 44e8f06 (add <intro of recursion > program)
