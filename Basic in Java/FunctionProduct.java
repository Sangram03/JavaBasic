
import java.util.Scanner;

public class FunctionProduct {
    public static int calculateProduct(int a,int b){
    return  a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Number:");
        int a= sc.nextInt();
        System.out.println("Enter your Second Number");
        int b=sc.nextInt();
        System.out.println("The product of two number is "+calculateProduct(a, b));
    }
}
