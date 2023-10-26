public class Main {
    
    public static void main(String[] args)
    {
        // Ask for the equation
        String equation = Simple.strInput("Input the equation you would like to solve: ");

        // Make our object
        LinearEquation linearEquation = new LinearEquation(equation);

        // Now get x
        double x = linearEquation.solveLinearEquation();

        // Print out the solution
        // Test for a flat number (no decimals needed) so it prints nicer
        if (x == (int) x)
        {
            // Print x as an int, so it gets rid of the decimals
            Simple.sprintln("X = " + (int) x);
        }

        // If it has a decimal point print this
        else
        {
            // Print x
            Simple.sprintln("X = " + x);
        }
    }
}
