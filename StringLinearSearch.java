import java.util.Arrays;
import java.util.Scanner;
class StringLinearSearch {
    public static void main(String[] args) {
        String str = "Nitin";
        System.out.print(Arrays.toString(str.toCharArray()));
        System.out.print("\nEnter Element to Search : ");
        Scanner input = new Scanner(System.in);
        String element=input.nextLine();
        System.out.println("Element search : "+element);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (element.charAt(0) == str.charAt(i)) {
                System.err.print("Character Found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print("Character not Found");
        }
    }
}
