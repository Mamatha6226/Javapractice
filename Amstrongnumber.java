package Javapractice;

public class Amstrongnumber {
    public static void main(String args[]){
        int num = 408, originalnum, remainder, result = 0;
        originalnum = num;
        while(originalnum!=0){
            remainder = originalnum%10;
            result += Math.pow(remainder, 3);
            originalnum = originalnum/10;
        }
        if(result == num)
            System.out.print(num+ " is a amstrong number");
        else
            System.out.print(num+ " is not an amstrong number");
    }
}
