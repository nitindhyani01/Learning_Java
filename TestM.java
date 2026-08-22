import java.util.Scanner;
class TestM{
    public static void main(String[] args){
        sum();
    }
    static void sum(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter Second number : ");
        int b =input.nextInt();
        System.out.println("Sum is "+(a+b));
    }
}