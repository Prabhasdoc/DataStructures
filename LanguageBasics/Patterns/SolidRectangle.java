package DataStructures.LanguageBasics.Patterns;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Read an integer from the user, which represents the size of the rectangle
            int n = sc.nextInt();

            // Loop through each row of the rectangle
            for (int i = 0; i < n; i++) {
                // Loop through each column of the rectangle
                for (int j = 0; j < n; j++) {
                    // Print a "*" character followed by a space
                    System.out.print("* ");
                }
                // Move to the next line after printing each row
                System.out.println();
            }
        }
    }
}
