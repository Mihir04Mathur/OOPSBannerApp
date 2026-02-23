/**
 * OOPS Banner App - Prints a banner to the console.
 * Use Case 7: Store Character Pattern in a Class.
 *
 * This class encapsulates character data and its corresponding banner pattern,
 * improving organization and reusability. It stores the character and an
 * array of Strings representing the ASCII art for that character.
 *
 * @author MIHIR MATHUR
 * @version 1.0
 */
public class CharacterPattern {
    private char character;
    private String[] pattern;

    /**
     * Constructs a CharacterPattern with the given character and pattern.
     *
     * @param character The character this pattern represents.
     * @param pattern   The ASCII art representation of the character.
     */
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    /**
     * Gets the character this pattern represents.
     *
     * @return The character.
     */
    public char getCharacter() {
        return character;
    }

    /**
     * Gets the 7-line ASCII art pattern for the character.
     *
     * @return A String array containing the pattern lines.
     */
    public String[] getPattern() {
        return pattern;
    }
}
