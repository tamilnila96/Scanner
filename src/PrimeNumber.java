import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value");
        int value = input.nextInt();
        if(value <= 1){
            System.out.println("Not a prime");
            return;

    }
        for(int i = 2; i<value ; i++){
            if( value % i==0){
                System.out.println("Not a prime");
                return;
            }
        }
System.out.println("This is a prime number");

    }
}



