package recursion;

public class Recur_16P {

    static int searchCount(int arr[], int index, int val) {
        if (index == arr.length) {
            return 0;
        }

        if (arr[index] == val) {
            return 1 + searchCount(arr, index + 1, val);
        } else {
            return searchCount(arr, index + 1, val);
        }
    }

    public static void main(String[] args) {
        int arr[] = {90, 100, 30, 88, 555, 100, 88, 88};
        int value = 88;
        int count = searchCount(arr, 0, value);
        System.out.println("Count of " + value + " = " + count);
    }
}
// find index of given element