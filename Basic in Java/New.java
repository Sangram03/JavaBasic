
import java.util.Scanner;


// ! Her the static class .
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
 ! Enter input function here .
 */
        System.out.print("Enter the first value :");
        int a=sc.nextInt();
        System.out.print("Enter the Second value :");
        int b=sc.nextInt();
        System.out.println("Enter the operation select from Below \n + \n - \n * \n / \n");
        char operation =sc.next().charAt(0);
/*
 ! Operation will be perform here .
 */
        if (operation == '+')
        {
            System.out.println("THE ADDITION IS :"+(a+b));
        }
        else if (operation =='-')
        {
            System.out.println("THE DiFF is:"+(a-b));
        }
        else if (operation =='*')
        {
            System.out.println("THE MULTI is: "+(a*b));
        }
        else if (operation =='/')
        {
            System.out.println("THE DIV :"+(a/b));
        }
        


    }
}
