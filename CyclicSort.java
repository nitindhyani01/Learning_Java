
import java.util.Arrays;

class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp;
        temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
