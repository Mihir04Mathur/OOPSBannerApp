# OOPS Banner App

A simple Java application designed to demonstrate progressive code improvements while printing a stylized "OOPS" banner to the console. This project showcases the evolution of a basic printing task into a more structured and memory-efficient solution.

## Project Structure

The project is organized into three Use Cases (UC), each representing a step in the application's development:

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

## Design Decisions

The progression from UC1 to UC3 demonstrates a focus on:
1.  **Functionality First:** Getting the basic output working (UC1).
2.  **User Experience:** Making the output visually appealing (UC2).
3.  **Code Quality:** improving the underlying implementation for better maintenance and efficiency (UC3).

## Improvements
*   **Memory Efficiency:** UC3 uses `String.join` to avoid the overhead of repeated string concatenation or multiple I/O calls giving a significant performance boost over the previous iteration.
*   **Maintainability:** Grouping the banner lines into variables makes the code cleaner and easier to modify.

## How to Run

Ensure you have the Java Development Kit (JDK) installed on your system.

1.  **Navigate to the project directory:**
    ```bash
    cd c:\Users\Owner\Documents\AntiGravity\OOPS_Banner_App
    ```

2.  **Compile and Run a specific Use Case (e.g., UC3):**
    
    *   **Compile:**
        ```bash
        javac UC3/OOPSBannerApp.java
        ```
    *   **Run:**
        ```bash
        java -cp UC3 OOPSBannerApp
        ```

    *Replace `UC3` with `UC1` or `UC2` to run the other versions.*

## Requirements

*   Java Development Kit (JDK) 8 or higher.
