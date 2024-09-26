
public class SolidPattern {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        for(int i=1;i<=n;i++) {
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

// public class SolidPattern {
//     public static void main(String[] args) {
//         int n = 4; // Rows
//         int m = 6; // Columns
        
//         for (int i = 1; i <= n; i++) { // Outer loop for rows
//             for (int j = 1; j <= m; j++) { // Inner loop for columns
//                 System.out.print("*"); // Print '' without newline
//             }
//             System.out.println(); // Move to the next line after printing each row
//         }
//     }
// }
