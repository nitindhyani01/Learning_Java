// public class Array {
//     public static void main(String[] args) {
//         int arr[]={1,5,6,7,8,9};
//         System.out.println(arr[0]);
//         for(int i=0;i<=5;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

import java.util.Scanner;
public static void main(String[] args){
    int arr[]= new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Elements");
    for(int i=0;i<5;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Array Elements");
 for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
    }
}