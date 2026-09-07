class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(IsSorted(arr, 0));
    }
    public static boolean IsSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index]<arr[index+1] && IsSorted(arr, index + 1);
    }
}
