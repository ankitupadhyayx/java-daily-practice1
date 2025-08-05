//count even and odd num between 1 to n
package recursion;
public class Recur_7 {
    static void EvenOdd(int n ,int even,int odd){
        if(n==0){
            System.out.println("even:"+even);
            System.out.println("odd :"+odd);
            return;
        }
        if(n%2==0){
            even++;
        }
        else{
            odd++;
        }
        EvenOdd(n-1,even,odd);
    }
    public static void main(String[] args) {
        EvenOdd(99,0,0);
    }
}

