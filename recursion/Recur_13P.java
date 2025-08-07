// sum of array element
package recursion;

public class Recur_13P {
    static int doSum(int arr[], int index) {
        if(arr.length==index){
            return 0;
        }
        int sum = doSum(arr,index+1);
        return sum+arr[index];

    }


    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum = doSum(arr,0);
        System.out.println("sum "+sum);
    }
}