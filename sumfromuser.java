import java.util.Scanner; // Scanner class use to input from user
public class sumfromuser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int FirstNum = sc.nextInt();
        System.out.println("Enter Second number");
        int SecNum = sc.nextInt();
        System.out.println("Sum of "+FirstNum+" & "+SecNum+" is "+(FirstNum+SecNum));
    }
}
