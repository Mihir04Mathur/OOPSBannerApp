/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 3: Refactoring to use String.join for memory efficiency.
 * In this version, we construct the entire banner string by joining individual
 * lines
 * with a newline delimiter, which is more memory efficient than repeated
 * concatenation.
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
        // Define the lines of the banner
        String line1 = "  ***    ***   ****   ****  ";
        String line2 = " *   *  *   *  *   *  *     ";
        String line3 = " *   *  *   *  *   *  *     ";
        String line4 = " *   *  *   *  ****   ****  ";
        String line5 = " *   *  *   *  *          * ";
        String line6 = " *   *  *   *  *          * ";
        String line7 = "  ***    ***   *      ****  ";

        // Use String.join() to construct the full banner string
        // This avoids creating intermediate String objects that would occur with
        // concatenation
        String banner = String.join(System.lineSeparator(),
                line1,
                line2,
                line3,
                line4,
                line5,
                line6,
                line7);

        // Print the assembled banner
        System.out.println(banner);
    }
}
