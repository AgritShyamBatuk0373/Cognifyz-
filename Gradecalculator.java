import java.text.DecimalFormat;
import java.util.Scanner;

public class Gradecalculator {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String True= "yes";
        System.out.print("Enter the number of Subjects: ");
        int numberOfSubjects = scan.nextInt();
        scan.nextLine();

        String[] sub_array = new String[numberOfSubjects];
        for(int i=0; i<numberOfSubjects; i++)
        {
            System.out.print("Enter the name of subject:  ");
            String subjectName= scan.nextLine();
            sub_array[i]= subjectName;
        }
        // Input each grade and calculate the sum
        int temp_sum = 0;
        while(True.equals("yes"))
        {
            for (int i = 0; i < numberOfSubjects; i++)
            {
            System.out.print("Enter grade for " + sub_array[i]+ " : ");
            double grade = scan.nextDouble();
            temp_sum += grade;
            }
            double average= (double) temp_sum/numberOfSubjects;

            // define the format of decimal of average result
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formatted_grade= decimalFormat.format(average);
            // Display the average to the user
            System.out.println("Average Grade: " + average);

            // prompt the user to calculate the another grade or not
            System.out.println("If you want to calculate average grade of another student then enter yes otherwise no");
            True= scan.next().toLowerCase();
        }
        // Close the scanner
        scan.close();
    }
}
