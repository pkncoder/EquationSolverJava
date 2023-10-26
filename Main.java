public class Main {
    
    public static void main(String[] args)
    {
        // Ask for the equation
        String equation = Simple.strInput("Input the equation you would like to solve: ");


        // Get the length for how many times we need to loop
        int equationLen = equation.length();

        // TODO: Find out what the HELL THIS IS
        int sign = 1;

        // Make the total x value
        double totalX = 0;

        // Make I, basicly it is used for saving the curent value for maths
        int i = 0;

        // Make numericalValue, which is the total non-x numbers
        double numericalValue = 0;


        // Loop through the equation
        for (int j = 0; j < equationLen; j++)
        {
            // Test for opporators
            if (equation.charAt(j) == '+' || equation.charAt(j) == '-')
            {
                // TODO: Why????
                if (j > i)
                {
                    // Set the numerical value to the number there
                    numericalValue += sign * Integer.parseInt(equation.substring(i, j));
                }
    
                // Set i as j to save this spot
                i = j;
            }

            // If the curent spot is equal to x
            else if (equation.charAt(j) == 'x')
            {

                // For +x
                if ((i == j) || equation.charAt(j - 1) == '+')
                {
                    // Make the total x value 1 more
                    totalX += sign;
                }

                // For -x
                else if (equation.charAt(j - 1) == '-')
                {
                    // Make the total x value 1 more
                    totalX -= sign;
                }

                // For the total amount for the spot before the x
                else
                {
                    // Make the total the amount for the spot before the x
                    totalX += sign * Integer.parseInt(equation.substring(i, j));
                }

                // Make i, j + 1 so we can save this spot, the + 1 is because of the x spot, so it can skip that
                i = j + 1;
            }

            // Test for equal sign
            else if (equation.charAt(j) == '=')
            {
                if (j > i)
                {
                    // TODO: Why this also
				    numericalValue += sign * Integer.parseInt(equation.substring(i, j));
                }

                // Flip sign
                sign = -1;

                // Add one to I, so one spot further than the i
                i = j + 1;
            }

        }

        // For the number at the end
        if (i < equationLen)
        {
            //Simple.sprintln(equation.substring(i, equationLen) + "\n");
            numericalValue = numericalValue + sign * Integer.parseInt(equation.substring(i, equationLen));
        }
        
        //Simple.sprint(totalX + ", " + numericalValue + ", " + i);

        // Print out the sulution
        Simple.sprintln("X = " + totalX / (numericalValue * -1));
    }
}
