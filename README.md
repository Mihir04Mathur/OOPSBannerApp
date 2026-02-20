# OOPS Banner App

A simple Java application designed to demonstrate progressive code improvements while printing a stylized "OOPS" banner to the console. This project showcases the evolution of a basic printing task into a more structured, memory-efficient, and modular solution.

## Project Structure

The project is organized into four Use Cases (UC), each representing a step in the application's development:

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
    *   Further refactors the solution by storing the banner lines in a `String` array.
    *   Uses an enhanced `for` loop (for-each) to iterate through the array and print the banner.
    *   *Goal:* Improve modularity, reduce code repetition, and enhance maintainability.

## Design Decisions

The progression from UC1 to UC4 demonstrates a logical flow of software engineering best practices:
1.  **Functionality First (UC1):** Getting the basic output working.
2.  **User Experience (UC2):** Making the output visually appealing.
3.  **Code Optimization (UC3):** Improving memory usage by reducing object creation and I/O calls.
4.  **Maintainability & Modularity (UC4):** Using data structures (Arrays) and control flow (Loops) to separate data from logic, making the code cleaner and easier to extend.

## Key Improvements by Version
*   **UC3 vs UC2:** `String.join` creates a single String object, avoiding the overhead of multiple `System.out.println` calls or repeated string concatenation.
*   **UC4 vs UC3:** Storing lines in an **Array** allows for centralized data management. Using a **Loop** removes code duplication (writing `System.out.println` only once), making it trivial to add or remove lines from the banner without changing the printing logic.

## How to Run

Ensure you have the Java Development Kit (JDK) installed on your system.

1.  **Navigate to the project directory:**
    ```bash
    cd c:\Users\Owner\Documents\AntiGravity\OOPS_Banner_App
    ```

2.  **Compile and Run a specific Use Case (e.g., UC4):**
    
    *   **Compile:**
        ```bash
        javac UC4/OOPSBannerApp.java
        ```
    *   **Run:**
        ```bash
        java -cp UC4 OOPSBannerApp
        ```

    *Replace `UC4` with `UC1`, `UC2`, or `UC3` to run other versions.*

## Requirements

*   Java Development Kit (JDK) 8 or higher.
