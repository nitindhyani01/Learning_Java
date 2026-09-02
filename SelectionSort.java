import java.util.Arrays;
class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 2, 8, 5};
        System.out.print(Arrays.toString(Ssort(arr)));
        //System.out.println(getMaxElement(arr, 0, arr.length));
        //System.out.println(Arrays.toString(swap(arr, 0, 5)));
    }

    public static int[] Ssort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - i - 1;
            int Maxindex = getMaxElement(arr, i, j);
            swap(arr, Maxindex, j);
            }
            return arr;
        }
        
    public static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static int[] swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}