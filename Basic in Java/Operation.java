
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        int a,b,c,d,Sum,Multi,Divide,Substract,Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        a=sc.nextInt();
        System.out.println("Enter your 2nd number");
        b=sc.nextInt();
        System.out.println("Enter your 3rd number");
        c=sc.nextInt();
        System.out.println("Enter your 4th number");
        d=sc.nextInt();

        Sum=a+b+c+d;
        System.out.println("The Sum is"+Sum);
        Multi=a*b*c*d;
        System.out.println("The Multi is"+Multi);
        Divide=a/b;
        System.out.println("The Division is"+Divide);
        Substract=a-b;
        System.out.println("The Subtract is"+Substract);

        Percentage=(a+b+c+d)/4*100;
        System.out.println("In percentage"+Percentage);





    }
}
