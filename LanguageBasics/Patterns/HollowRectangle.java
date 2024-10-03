package DataStructures.LanguageBasics.Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5; 
        int cols = 10;
//hollow purple
        // print top border
        for (int i = 0; i < cols; i++) {
            System.out.print("*");
        }
        
        System.out.println();

        // print middle rows
        for (int i = 0; i < rows - 2; i++) {
            System.out.print("*"); // print left border
            for (int j = 0; j < cols - 2; j++) {
                System.out.print(" "); // print hollow space
            }
            System.out.print("*"); // print right border
            System.out.println();
        }

        // print bottom border
        for (int i = 0; i < cols; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
