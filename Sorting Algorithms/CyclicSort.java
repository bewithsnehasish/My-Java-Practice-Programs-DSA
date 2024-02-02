import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,8,5,7,6,2,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int correct) {
        int temp = arr[first];
        arr[first]=arr[correct];
        arr[correct]=temp;
    }
}

