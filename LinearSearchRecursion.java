class LinearSearchRecursion{
    public static void main(String[] args) {
        int[] arr={1,9,3,6,8,2};
        System.err.println(Srch(arr,0,9));
    }
    public static int Srch(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        else{
         return Srch(arr, index+1, target);
         }
    }
}