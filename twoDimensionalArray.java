
import java.util.Scanner;
class twoDimensionalArray{
    public static void main(String[] args) {
    int arr[][] = new int[2][3];  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Elements");
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            arr[i][j]= sc.nextInt();
        }
    }
    System.out.println("2 D ARRAY ");
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }  
}

