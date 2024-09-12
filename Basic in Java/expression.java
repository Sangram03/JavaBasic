//11. Declare two double variables and add them. Print the result.
import java.util.Scanner;
class expression {
    public static void main(String args[])

    {
      
        double a1,b1;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your First double number");
        a1 = sc.nextDouble();
        System.out.println("enter your Second Double number");
        b1 = sc.nextDouble();

        System.out.println("The sum is "+(a1+b1));

        //12. Subtract one double variable from another and print the result.

        double c1,c2;

        System.out.println("Enter your First double number");
        c1 = sc.nextDouble();
        System.out.println("Enter your Second double number");
        c2 = sc.nextDouble();

        System.out.println("The subtract is"+(c1-c2));


        //13. Multiply two double variables and print the result.

        double b2,b3;
        System.out.println("Enter your first  double number");
        b2 = sc.nextDouble();
        System.out.println("Enter your Second double number");
        b3 = sc.nextDouble();

        System.out.println("The multiply is"+(b2*b3));

        //14. Divide one double variable by another and print the result.

        double n1,n2;

        System.out.println("Enter Your first double number");
        n1 = sc.nextDouble();
        System.out.println("Enter Your Second double Number");
        n2 = sc.nextDouble();

        System.out.println("The division"+(n1/n2));

        //15. Declare an integer variable and a double variable. Add them and print the result.


        double n7;
        int n8;

        System.out.println("Enter Your First  double Number");
        n7 = sc.nextDouble();
        System.out.println("Enter your Second  Integer Number");
        n8 = sc.nextInt();


        System.out.println("The sum"+(n7+n8));

        //16. Concatenate two strings and print the result.
        String a00,m80;

        System.out.println("Enter your First Name :-");
        a00 = sc.next();
        System.out.println("Enter Your Last Name  :-");
        m80 = sc.next();

        System.out.println("The Sum"+(a00+" "+m80));


        //17. Concatenate a string and an integer and print the result.

        String a7;
        int b6;


        System.out.println("Enter Your name ");
        a7 = sc.next();
        System.out.println("Enter a Number");
        b6 = sc.nextInt();

        System.out.println("output will be"+(a7+" "+b6));


        //18. Concatenate a string and a double and print the result.


        String b9;
        double b0;

        System.out.println("Enter My Name");
        b9 = sc.next();
        System.out.println("Enter A double Number");
        b0 = sc.nextDouble();

        System.out.println("output will be"+(b9+" "+b0));



        //19. Declare a char variable and an integer variable. Add them and print the result.

        char Ad;
        int c5;

        System.out.println("Enter a Letter");
        Ad = sc.next().charAt(0);
        System.out.println("Enter a number");
        c5 = sc.nextInt();


        System.out.println("Output will be"+(Ad+" "+c5));



        //20. Declare a boolean variable and use it in an if statement to print a message.

        boolean t1,c9;

        System.out.println("Enter a boolean value");
        t1 = sc.nextBoolean();
       System.out.println("enter a second boolean value");
       c9 = sc.nextBoolean();

        if(t1==c9)
        {
            System.out.println("Both are Same");
        }
        else
        {
            System.out.println("Both are Different value");
        }




        





        
            
        }
    }


