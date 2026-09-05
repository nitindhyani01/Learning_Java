import java.util.Scanner;
class FibonacciRecursion{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number to find Fibonacci : ");
    int num = input.nextInt();
    System.out.println(Fibo(num));
    }
    public static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}