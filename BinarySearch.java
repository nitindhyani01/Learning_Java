//Binary search on ascending sorted array 
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 4;
        int ans = (BS(arr, target));
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is at position : "+(ans+1));
        }
    }

    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
