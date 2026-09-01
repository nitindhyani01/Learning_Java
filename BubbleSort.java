import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {9, 5, 3, 2, 8, 1};
        ExchangeSort(nums);
        System.out.println(Arrays.toString(nums));
        // for (int i = 0; i <= nums.length - 1; i++) {
        //     System.out.print(" " + ans[i]);
        // }
    }

    public static int[] ExchangeSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
