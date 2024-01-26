import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        boolean convert;
        do
        {
            System.out.print("Enter the temp value:  ");
            double input_tempValue= scan.nextDouble();

            scan.nextLine();
            System.out.print("Enter the unit of temp(C for celsius and F for fahrenheit):  ");
            String unit_value=scan.next().toLowerCase();
            scan.nextLine();
            double degree_celsius, degree_fahrenheit;
            String formatted_degreeF, formatted_degreeC;
            if(unit_value.equals("c"))
            {
               degree_fahrenheit=(input_tempValue*9/5)+32;
               formatted_degreeF= decimalFormat.format(degree_fahrenheit);
                System.out.println("The equivalent fahrenheit value for above temp value= "+formatted_degreeF+" degree fahrenheit.");
            }else
            {
                degree_celsius=(input_tempValue-32)*5/9;
                formatted_degreeC= decimalFormat.format(degree_celsius);
                System.out.println("The equivalent celsius value for above temp value= "+formatted_degreeC+" degree celsius.");
            }

            System.out.println("If you want to convert another value then enter true otherwise false.");
            convert= scan.nextBoolean();

        }while(convert);

        // close the scanner
        scan.close();
    }

}