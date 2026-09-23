import java.util.Scanner;
class primeornot {
    public static void main(String args[]) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Enter number to check if number is prime or not : ");
        int number = input.nextInt();
        isprime(number);
        input.close();
    }

    public static void isprime(int num) {
        if (num < 2) {
            System.out.println(num + " is not prime");
            return;
        } 
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return;
            }
        }
        System.out.println(num + " is prime");
    }
}
