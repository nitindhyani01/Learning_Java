
import java.util.Arrays;

class FirstLast {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 4, 4, 8};
        int target = 4;
        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
