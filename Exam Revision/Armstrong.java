import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check if number is Armstrong or not : ");
        int num = input.nextInt();
        int sum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num / 10;
        }
        if(sum == originalNum){
            System.out.print("Number is Armstrong");
        }
        else{
            System.out.print("Number is not Armstrong");
        }
    }
}