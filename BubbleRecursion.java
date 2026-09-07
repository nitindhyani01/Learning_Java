import java.util.Arrays;
class BubbleRecursion{
    public static void main(String[] args) {
        int[] nums={3,6,9,8,2,7};
        bubble(nums, nums.length-1, 0);
        System.out.print(Arrays.toString(nums));
    }
    public static void bubble(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i, j+1);
        }
        else{
            bubble(arr, i-1, 0);
        }
    }
}