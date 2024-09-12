
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of A :");
        a = sc.nextInt();
        System.out.println("Enter The Value of B :");
        b = sc.nextInt();
        System.out.println("The Sum :" +(a+b));
        System.out.println("The Subtraction :" +(a-b));
        System.out.println("The Multiplication :"+(a*b));
        System.out.println("The Division :"+(a/b));
        System.out.println("The Modulus :"+(a%b));
        System.out.println("The Increment of A :"+(++a));
        System.out.println("The Decrement is of B :"+(--b));
        
    }
}
