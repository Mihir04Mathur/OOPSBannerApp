import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 8: Use Map for Character Patterns and Render via Function.
 *
 * This version uses a HashMap to store the mapping between characters
 * and their respective 7-line string array patterns. A generalized function
 * is implemented to dynamically assemble and render the banner for any given
 * word by looking up characters in the Map.
 *
 * @author MIHIR MATHUR
 * @version 1.0
 */
public class OOPSBannerApp {

    // Centralized Map for character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize the map with patterns for the required characters
        patternMap.put('O', new String[] {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        });

        patternMap.put('P', new String[] {
                " ****  ",
                " *   * ",
                " *   * ",
                " ****  ",
                " *     ",
                " *     ",
                " *     "
        });

        patternMap.put('S', new String[] {
                " ****  ",
                " *     ",
                " *     ",
                " ****  ",
                "     * ",
                "     * ",
                " ****  "
        });
    }

    public static void main(String[] args) {
        System.out.println("=== OOPS Banner App - UC8: Use Map & Render Function ===");
        System.out.println();

        // Render the word "OOPS"
        renderBanner("OOPS");
    }

    /**
     * Renders a banner for the given word by looking up character patterns
     * in the centralized map.
     *
     * @param word The word to render as a banner.
     */
    public static void renderBanner(String word) {
        // Assume 7 lines per character pattern
        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Assemble the banner line by line
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                String[] pattern = patternMap.get(Character.toUpperCase(ch));
                
                if (pattern != null) {
                    bannerLines[i].append(pattern[i]);
                } else {
                    // Fallback for missing characters (e.g., spaces)
                    bannerLines[i].append("       ");
                }
                
                // Add spacing between letters except for the last one
                if (j < word.length() - 1) {
                    if (word.charAt(j) == 'O' && word.charAt(j + 1) == 'O') {
                         bannerLines[i].append("  ");
                    } else {
                         bannerLines[i].append("   ");
                    }
                }
            }
        }

        // Print the assembled banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
        System.out.println();
    }
}
