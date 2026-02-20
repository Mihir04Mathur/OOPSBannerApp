/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 7: Store Character Pattern in a Class.
 *
 * This version uses the new CharacterPattern class to instantiate object
 * representations for each unique letter ('O', 'P', 'S') containing their
 * ASCII art data. The application then retrieves the patterns from these
 * objects and assembles them into a complete banner string on a line-by-line
 * basis using StringBuilder.
 *
 * @author MIHIR MATHUR
 * @version 1.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Define CharacterPattern objects
        CharacterPattern letterO = new CharacterPattern('O', new String[] {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        });

        CharacterPattern letterP = new CharacterPattern('P', new String[] {
                " ****  ",
                " *   * ",
                " *   * ",
                " ****  ",
                " *     ",
                " *     ",
                " *     "
        });

        CharacterPattern letterS = new CharacterPattern('S', new String[] {
                " ****  ",
                " *     ",
                " *     ",
                " ****  ",
                "     * ",
                "     * ",
                " ****  "
        });

        System.out.println("=== OOPS Banner App - UC7: Character Pattern Class ===");
        System.out.println();

        // Assemble the banner
        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
            bannerLines[i].append(letterO.getPattern()[i]).append("  ");
            bannerLines[i].append(letterO.getPattern()[i]).append("   ");
            bannerLines[i].append(letterP.getPattern()[i]).append("   ");
            bannerLines[i].append(letterS.getPattern()[i]);
        }

        // Print the assembled banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }
}
