// find element in given array othervise -1
package recursion;

public class Recur_15P {
    static int search(int arr[],int index,int val){
        if(arr.length==index) {
            return -1;
        }
        if(arr[index]==val){
            return index;
        }
        return search(arr,index+1,val);

    }

    public static void main(String[] args) {
        int arr[] = {90,100,30,88,555,100};
        int value = 88;
        int index = search(arr,0,value);
        System.out.println(index>=0 ? "found":"not found");
    }
}
