
import java.util.Random;
import java.util.Scanner;

public class RandomPassword
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        boolean generate;
        do {
            System.out.print("Enter the length of the password: ");
            int pswrd_length = scan.nextInt();
            // ask user for what to specify the inclusion of numbers, upper or lower, special characters

            System.out.print("Include numbers? (yes/no):   ");
            boolean include_num = scan.next().equalsIgnoreCase("yes");
            scan.nextLine();

            System.out.print("Include Uppercase? (yes/no):   ");
            boolean include_upper = scan.next().equalsIgnoreCase("yes");
            scan.nextLine();

            System.out.print("Include Lowercase? (yes/no):   ");
            boolean include_lower = scan.next().equalsIgnoreCase("yes");
            scan.nextLine();

            System.out.print("Include SpecialCharacter? (yes/no):   ");
            boolean include_spclChar = scan.next().equalsIgnoreCase("yes");
            scan.nextLine();

            // Call the method for password
            String Password = generate_passoword(pswrd_length, include_num, include_upper, include_lower, include_spclChar);

            // Print the random generated password
            System.out.println("The Random Password generated is  " + Password);

            System.out.println("If you want to another password to generate enter ( true/false)");
           generate=  scan.nextBoolean();

        }while(generate);

        // close the scanner
        scan.close();
    }

    public static String generate_passoword(int length, boolean numbers, boolean Upper, boolean Lower,boolean Special )
    {

        String Uppercase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lowercase= "abcdefghijklmnopqrstuvwxyz";
        String Numbers= "1234567890";
        String SpecialChar= "`~!@#$%^&*()-_=+[]{}|;:'\\\",.<>/?";

        StringBuilder rand_password = new StringBuilder();
        String allChars= "";
        if (numbers)
        {
            allChars+= Numbers;
        }
        if(Upper){
            allChars+= Uppercase;
        }
        if(Lower){
            allChars+= Lowercase;
        }
        if(Special){
            allChars+= SpecialChar;
        }
        if(allChars.isEmpty()){
            System.out.println("Sorry no charcter is genrated.");
            return "";

        }

        Random randomPsword= new Random();
        for(int i=0; i<length;i++){
            int RandomIndex = randomPsword.nextInt(allChars.length());
            rand_password.append(allChars.charAt(RandomIndex));
        }
            String passWord= rand_password.toString();
        return passWord;
    }
}
