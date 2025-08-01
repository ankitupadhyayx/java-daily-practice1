//Write a program to swap two numbers using a third variable.
package beginning;

public class SwapNum {
    public static void main(String[] args) {
        int a = 41;
        int b = 14;
        System.out.println("Before swap:");
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b=temp;
        System.out.println("After swap:");
        System.out.println("a:"+a + ",b:" +b);
    }
}
