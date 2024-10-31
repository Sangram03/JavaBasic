class BB{
    public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
        printRow(i, 5 - i); // Top half
      }
      for (int i = 1; i <= 5; i++) {
        printRow(5 - i, i); // Bottom half
      }
    }
    
    // Method to print a row with the specified spaces and star spacing
    private static void printRow(int leadingSpaces, int middleSpaces) {
      printSpaces(leadingSpaces);
      printStars();
      printSpaces(middleSpaces * 2); // Middle spaces, doubled for visual spacing
      printStars();
      System.out.println();
    }
    
    // Method to print a given number of spaces
    private static void printSpaces(int count) {
      for (int i = 0; i < count; i++) {
        System.out.print(" ");
      }
    }
    
    // Method to print a fixed 5 stars
    private static void printStars() {
      for (int i = 0; i < 5; i++) {
        System.out.print("*");
      }
    }
  }