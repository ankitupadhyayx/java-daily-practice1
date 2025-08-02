package loops;

public class Pattern2 {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line =1 ; line<=noOfLines ; line++ ){
            for(int space = noOfLines; space > line; space--) {
                System.out.print(" ");
            }
            for (int star =1;star<=noOfLines;star++){
            System.out.print("*");}
            System.out.println();
        }
    }
}
//     *****
//    *****         
//   *****
//  *****
// *****
