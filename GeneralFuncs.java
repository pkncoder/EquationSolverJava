// Scanner for sinputs
import java.util.Scanner;

public class GeneralFuncs {
    // Scanner object
    static Scanner input = new Scanner(System.in);

    // Simple print
    public static void sprint(String x)
    {
        System.out.print(x);
    }


    // Simple println
    public static void sprintln(String x)
    {
        System.out.println(x);
    }


    // Simple string input func
    public static String strInput(String x)
    {
        // Ask for the input
        GeneralFuncs.sprint(x);
        
        // Return the data from the input
        return input.nextLine();
    }
}
