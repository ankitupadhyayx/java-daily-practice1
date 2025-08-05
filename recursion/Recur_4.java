package recursion;

public class Recur_4 {
    static boolean palin(int num , int org , int reverse){
        if(num==0){
            return org  == reverse ;
        }
        reverse = reverse*10+num%10;
        return palin(num/10,org,reverse);
    }
    //static int palindrome(int num){}

    public static void main(String[] args) {
        boolean result = palin(151,152,0);
        System.out.println(result ? "palindrome " : "not");
    }
}
//palindrome number