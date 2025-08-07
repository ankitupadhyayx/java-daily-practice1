package recursion;
public class Recur_11P {
    static void traverse(int a[],int index){
        if(index==a.length){
            return ;
        }
        System.out.println(a[index]);
        index++;
        traverse(a,index);

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        traverse(arr,0);
    }
}
//Print all elements of an array using recursion