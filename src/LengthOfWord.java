import java.util.Scanner;
public class LengthOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String text = input.nextLine();
        System.out.println("The length of the given word is " + text.length());
    }
}
