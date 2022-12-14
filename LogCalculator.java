/*
* This program calculates how many logs can be put on the truck
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-09-14
*/
import java.io.Console;

/**
* This program calculates log length.
*/
final class LogCalculator {
    /**
    * Density of logs, in kg/m.
    */
    public static final float LOG_WEIGHT = 20;

    /**
    * Max load of logs.
    */
    public static final float TRUCK_WEIGHT = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private LogCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This function tells the user the number of logs a truck can carry
    * based on the number the user inputs.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        final Console console = System.console();
        final String logString = console.readLine("What is the size of the"
                        + "log (.25, .5, 1): ");

        final float logSize = Float.valueOf(logString);
        final float weight = logSize * logWeight;
        final float logAmount = truckWeight / weight;
        System.out.println(logAmount + " " + logSize + " logs would fill the"
                        + " truck");
        System.out.println("\nDone.");
    }
}
