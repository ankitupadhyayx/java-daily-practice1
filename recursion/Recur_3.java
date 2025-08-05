package recursion;

public class Recur_3 {
    static void show(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Ankit "+n);//pre logic
        show(n - 1);
        //post logic -backtracking
        System.out.println("upadhyay "+n);//post logic
    }

    public static void main(String[] args) {
        show(4);
    }
}