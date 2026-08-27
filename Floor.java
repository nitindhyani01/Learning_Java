class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;
        int ans=FloorVal(arr, target);
        System.out.println("Element: "+arr[ans]+" Position: "+(ans+1));
    }
    static int FloorVal(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
