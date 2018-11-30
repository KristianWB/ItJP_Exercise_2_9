import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        /* The task will be performed in three steps
        1) prompting the user for input and then assigning these inputs as essential parameters in defining variables
        2) Declaring and assigning the essential variable "acceleration" by calculation it from the defining variables
        3) Displaying the resulting acceleration on screen
         */

        // 1) Prompt for, declare and assign the essential parameters to defining variables
        System.out.print(
                "Please enter the velocity at time zero: "
        );
        double v0 = input.nextDouble(); // Declaring and assigning the defining variable v0

        System.out.print(
                "Please enter the velocity at the final time: "
        );
        double v1 = input.nextDouble(); // Declaring and assigning the defining variable v1

        System.out.print(
                "Please enter the time of object traverse from time zero to final time: "
        );
        double time = input.nextDouble(); // Declaring and assigning the defining variable time

        // 2) Declaring and assigning the essential variable acceleration
        double acceleration = (v1 - v0) / time; // Declaring and assigning the essential variable acceleration

        // 3) Displaying the results
        System.out.printf(
                "From the given parameters:" +
                "\nv0: " + v0 +
                "\nv1: " + v1 +
                "\ntime: " + time +
                "\nThe resulting acceleration is: " +
                "%.2f", acceleration
        );

    }
}
