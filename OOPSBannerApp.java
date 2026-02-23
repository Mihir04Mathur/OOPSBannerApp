/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 4: Refactoring to use a String Array and Loop.
 * In this version, we store the banner lines in a String array and use a loop to print them.
 * This improves modularity and makes the code cleaner compared to individual variables.
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
        // Define the lines of the banner in a String array
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
