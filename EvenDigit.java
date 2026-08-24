class EvenDigit{
    public static void main(String[] args) {
        int[] number={12,345,2,6,7896};
        System.out.println(findNumber(number));
    }
    static int findNumber(int number[]){
        int count = 0;
        for(int num:number){
            if(Even(num))
            {
            count++;
        }
        }
        return count;

    }
    static int numberOfDigit(int number){
        int count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        return count;
    }

    static boolean Even(int number){
        return numberOfDigit(number)%2==0;
    }
}