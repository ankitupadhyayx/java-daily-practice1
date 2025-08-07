package   recursion;

public class    Recur_14P {
    static boolean isSorted(int arr[],int index){
        if(arr.length-1==index){
            return true;
        }
        if(arr[index]>arr[index+1]) {
            return false;
        }
        return isSorted(arr,index+1);

    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println(isSorted(arr,0) ? "sorted":"not sorted");
    }
}
//check is sorted or not