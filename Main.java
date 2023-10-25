public class Main {
    
    public static void main(String[] args)
    {
        // Ask for the equation
        String equation = GeneralFuncs.strInput("Input the equation you would like to solve: ");


        // Get the length for how many times we need to loop
        int equationLen = equation.length();

        // Get the current sign (pos or negitive) for maths
        String sign;


        // Loop through the equation
        for (int j = 0; j < equationLen; j++)
        {
            // If the curent spot is equal to x
            if (equation.charAt(j) == 'x')
            {

            }

            // Test for equal sign
            if (equation.charAt(j) == '=')
            {
                
            }
            
        }
    }
}
