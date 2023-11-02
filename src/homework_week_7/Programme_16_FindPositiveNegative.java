package homework_week_7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int number =scanner.nextInt();
        findNumberIsPositiveOrZero(number);
        //closing scanner
        scanner.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveOrZero(int number){
        if(number > 0 ){
            System.out.println(number + "is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + "is a NEGATIVE number");

        }else {
            System.out.println(number + "is a Zero");
        }
    }
}
