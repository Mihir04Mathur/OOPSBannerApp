# OOPS Banner App

A simple Java application designed to demonstrate progressive code improvements while printing a stylized "OOPS" banner to the console. This project showcases the evolution of a basic printing task into a more structured, memory-efficient, and modular solution.

## Project Structure

The project is organized into seven Use Cases (UC), each representing a step in the application's development:

*   **UC1 (Basic Output):**
    *   The initial version simply prints the text "OOPS" to the console using a single `System.out.println` statement.
    *   *Goal:* Establish the basic functionality.

*   **UC2 (ASCII Art):**
    *   Enhances the output by printing a large, stylized "OOPS" banner using ASCII characters (asterisks).
    *   Uses multiple `System.out.println` statements, one for each line of the banner.
    *   *Goal:* Improve the visual presentation.

*   **UC3 (Optimization):**
    *   Refactors the ASCII art printing to be more memory-efficient.
    *   Instead of multiple print calls, it constructs the entire banner string using `String.join` and prints it in a single operation.
    *   *Goal:* Optimize code structure and performance.

*   **UC4 (Modularity & Loops):**
    *   Refactors the solution by storing the banner lines in a `String` array.
    *   Uses an enhanced `for` loop (for-each) to iterate through the array and print the banner.
    *   *Goal:* Improve modularity, reduce code repetition, and enhance maintainability.

*   **UC5 (Compact Initialization):**
    *   Streamlines the code by combining array declaration and initialization into a single statement.
    *   This eliminates the need for separate lines to populate the array, making the code more concise.
    *   *Goal:* Enhance code readability and conciseness.

*   **UC6 (Static Functions & Abstraction):**
    *   Introduces static helper methods (`getLetterO`, `getLetterP`, `getLetterS`) to generate the pattern for each distinct letter.
    *   The main method assembles these patterns to form the final banner.
    *   *Goal:* Promote code reuse, separation of concerns, and the DRY (Don't Repeat Yourself) principle.

*   **UC7 (Character Pattern Class):**
    *   Introduces a `CharacterPattern` class to encapsulate a character and its corresponding ASCII art pattern.
    *   Replaces static helper methods with object representations for each unique letter containing their ASCII art data.
    *   Uses `StringBuilder` for efficient string concatenation when assembling the banner.
    *   *Goal:* Improve modularity and scalability by managing patterns using Object-Oriented Programming (OOP) principles.

## Design Decisions

The progression from UC1 to UC7 demonstrates a logical flow of software engineering best practices:
1.  **Functionality First (UC1):** Getting the basic output working.
2.  **User Experience (UC2):** Making the output visually appealing.
3.  **Code Optimization (UC3):** Improving memory usage by reducing object creation and I/O calls.
4.  **Maintainability & Modularity (UC4):** Using data structures (Arrays) and control flow (Loops) to separate data from logic.
5.  **Code Conciseness (UC5):** Utilizing Java's array initialization syntax for cleaner, more readable code.
6.  **Abstraction (UC6):** Encapsulating logic into reusable functions to prevent hardcoding and simplify future updates.
7.  **Object-Oriented Design (UC7):** Encapsulating character data and its pattern into a dedicated class.

## Key Improvements by Version
*   **UC3 vs UC2:** `String.join` creates a single String object, avoiding the overhead of multiple `System.out.println` calls.
*   **UC4 vs UC3:** Storing lines in an **Array** allows for centralized data management. Using a **Loop** removes code duplication.
*   **UC5 vs UC4:** **Inline Initialization** reduces boilerplate code. Instead of declaring an array and then assigning values line-by-line, the entire structure is defined in one block.
*   **UC6 vs UC5:** **Modular Functions** decouple the *data* (the letter patterns) from the *logic* (printing). If the design of 'O' changes, you only update `getLetterO()` once, and it reflects everywhere 'O' is used.
*   **UC7 vs UC6:** **OOP Encapsulation** replaces fragmented helper methods with a dedicated class (`CharacterPattern`). This centralizes character management and uses `StringBuilder` for more efficient string construction.

## How to Run

Ensure you have the Java Development Kit (JDK) installed on your system.

1.  **Navigate to the project directory:**
    ```bash
    cd c:\Users\Owner\Documents\AntiGravity\OOPS_Banner_App
    ```

2.  **Compile and Run the latest code on this dev branch:

    *   **Compile:**
        ```bash
        javac OOPSBannerApp.java
        ```
    *   **Run:**
        ```bash
        java OOPSBannerApp
        ```

    *Switch to other branches (uc-1 to uc-7) to see earlier versions of the code.*

## Requirements

*   Java Development Kit (JDK) 8 or higher.
