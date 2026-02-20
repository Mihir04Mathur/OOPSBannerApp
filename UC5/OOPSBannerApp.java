/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 5: Array Initialization & String.join().
 * This version demonstrates combining array declaration and initialization
 * in a single statement, improving code conciseness.
 * 
 * @author MIHIR MATHUR
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * The main entry point of the application.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Combine array declaration and initialization
        // We use String literals directly in the initializer block
        String[] banner = {
                "  ***    ***   ****   ****  ",
                " *   *  *   *  *   *  *     ",
                " *   *  *   *  *   *  *     ",
                " *   *  *   *  ****   ****  ",
                " *   *  *   *  *          * ",
                " *   *  *   *  *          * ",
                "  ***    ***   *      ****  "
        };

        // Print the banner using an enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
