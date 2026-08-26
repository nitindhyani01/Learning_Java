
class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = CeilingVal(arr, target);
        if (ans == -1) {
            System.out.println("Out of bound value entered");
        } else {
            System.out.println("Search Value is " + arr[ans] + " Position of element is " + (ans + 1));
        }
    }

    static int CeilingVal(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        if (target == arr.length) {
            return -1;
        }
        return start;
    }
}
