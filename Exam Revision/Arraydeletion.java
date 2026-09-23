
import java.util.Arrays;
import java.util.Scanner;

class Arraydeletion {

    public static void main(String[] args) {
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("array : ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter Element to search : ");
        int SearchElement = input.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == SearchElement) {
                System.err.println("Element found at  position : " + (i + 1));
                found = true;
                break;
            }
        }
        if (found != true) {
            System.out.println("Element not found");
        }

        System.out.print("Enter Element to delete : ");
        int DltElement = input.nextInt();
        found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == DltElement) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        System.out.print("array after deletion : ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
