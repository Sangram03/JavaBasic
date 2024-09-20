public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}
