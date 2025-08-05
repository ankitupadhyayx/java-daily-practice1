package recursion;

public class Recur_9P {
    static void Name(int n ){
        if(n==3){
            return;
        }
        Name(n-1);
        System.out.println("Ankit Upadhyay");

    }
    public static void main(String[] args) {
        Name(5);
    }
}
//print name 5 times