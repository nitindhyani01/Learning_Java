
import java.util.Scanner; // import Scanner to get data from user

class linearsearch {

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 5, 1, 7, 0}; // create an array
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Array element to search : ");
        int element = input.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at : " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
