import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int sum = 0, reversed;
        int temp = num;//1221
        while(num>0)
        {
            reversed = num % 10;// to store the last digit
            sum = (sum*10)+reversed;//10+2=12,120+2=122
            num /= 10;// to eliminate the last digit which already done above
        }
        if(temp==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
    
}
