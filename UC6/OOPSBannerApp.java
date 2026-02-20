/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 6: Static Functions and Modular Pattern Generation.
 * In this version, we use static helper methods to generate the patterns for
 * distinct letters.
 * This prevents hardcoding the entire banner and allows for better modularity
 * and reuse.
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

        // Retrieve patterns for each letter using static helper methods
        String[] letterO = getLetterO();
        String[] letterP = getLetterP();
        String[] letterS = getLetterS();

        // Define the banner array size based on the height of the letters (7 lines)
        String[] banner = new String[7];

        // Construct the banner by joining the lines of each letter
        // We print "OOPS", so we need O, O, P, S
        for (int i = 0; i < 7; i++) {
            banner[i] = letterO[i] + "  " + letterO[i] + "   " + letterP[i] + "   " + letterS[i];
        }

        // Print the assembled banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Generates the pattern for the letter 'O'.
     * 
     * @return A String array representing the 7 lines of the letter 'O'.
     */
    public static String[] getLetterO() {
        return new String[] {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        };
    }

    /**
     * Generates the pattern for the letter 'P'.
     * 
     * @return A String array representing the 7 lines of the letter 'P'.
     */
    public static String[] getLetterP() {
        return new String[] {
                " ****  ",
                " *   * ",
                " *   * ",
                " ****  ",
                " *     ",
                " *     ",
                " *     "
        };
    }

    /**
     * Generates the pattern for the letter 'S'.
     * 
     * @return A String array representing the 7 lines of the letter 'S'.
     */
    public static String[] getLetterS() {
        return new String[] {
                " ****  ",
                " *     ",
                " *     ",
                " ****  ",
                "     * ",
                "     * ",
                " ****  "
        };
    }
}
