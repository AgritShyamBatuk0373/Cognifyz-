import java.util.Scanner;

public class PalindromeChecker
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        StringBuilder new_string= new StringBuilder();
        boolean convert = true;
        String input,reversed;

        while(convert)
        {
            System.out.print("Enter the input to check for palindrome : ");
            input= scan.nextLine();


            for (int i = input.length() - 1; i >= 0; i--) {
                new_string.append(input.charAt(i));
            }

            reversed = new_string.toString();

            if(input.equals(reversed))
            {
                System.out.println("Yes this is palindrome object.");
            }else
            {
                System.out.println("Sorry, this is not a palindrome object.");
            }
            System.out.println("If you want to check another palindrome then enter true otherwise false");
            convert= scan.nextBoolean();
            scan.nextLine();
        }
        // close the scanner
        scan.close();


    }
}