import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by PierreM on 26/01/2015.
 */
public class Average {
    public static void main(String[] args) {
        Average a = new Average();
        a.run();
    }

    public void run() {
        int counter = 0;
        int number = 0;
        int sum = 0;
        double average = 0;

        System.out.println("How many numbers would you like to enter? ");
        number = entry();

        while (counter < number) {
            System.out.println("Please enter a new number:");
            sum += entry();
            counter++;
        }

        average = sum / number;
        System.out.println("Mean average: "+average);
    }

    public int entry() {
        int input = 0;
        boolean correctInput = false;
        while(!correctInput) {
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("You did not enter a number! Please try again! ");
            }
        }
        return(input);
    }
}
