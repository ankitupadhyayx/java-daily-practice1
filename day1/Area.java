//Find the area and perimeter of a rectangle.
package day1;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give length:");
        float l = sc.nextFloat();
        System.out.println("Give width:");
        float w = sc.nextFloat();

        float area = l * w;
        float perimeter = 2 * (l + w);

        System.out.println("Area of rectangle is " + area + " unit");
        System.out.println("Perimeter of rectangle is " + perimeter + " unit");

        sc.close();
    }
}
