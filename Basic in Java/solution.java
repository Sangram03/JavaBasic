import java.util.Scanner;
 class Solution
 {
    public static void main(String args[])
    {
        //task 21

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your 1-Digit Number");
        a = sc.nextInt();

        switch (a) {
            case 1:
            
                System.out.println("The Number is One");
                break;
            
            case 2:
            {
                System.out.println("The Number is Two");
                break;
            }
            case 3:
            {
                System.out.println("The Number is Three"); 
                break;
            }
            case 4:
            {
                System.out.println("The Number is Four"); 
                break;
            }
            case 5:
            {
                System.out.println("The Number is Five");
                break; 
            }
            case 6:
            {
                System.out.println("The Number is Six"); 
                break;
            
            }
            case 7:
            {
                System.out.println("The Number is Seven"); 
                break;
            }
            case 8:
            {
                System.out.println("The Number is Eight"); 
                break;
            }
            case 9:
            {
                System.out.println("The Number is Nine"); 
                break;
            }

                

        }


        // Task 22

        float a4;

        System.out.println("Enter a float number");
        a4 = sc.nextFloat();

        System.out.println("The Number :"+a4);



        // task 23

        int f4,h5;

        System.out.println("Enter a number");
        f4 = sc.nextInt();
        System.out.println("Enter Second number");
        h5 = sc.nextInt();



        f4+=9;
        h5+=18;

        System.out.println("After Add 9 the Output will be "+f4);
        System.out.println("After Add 16 the Output will be "+h5);



        //task 24



        double g6,j8;

        System.out.println("Enter a Double Number");
        g6 = sc.nextDouble();
        System.out.println("Enter a Double Number");
        j8 = sc.nextDouble();

        g6-=8;
        j8-=7;

        System.out.println("After Subtract 8 the Output will be" +g6);
        System.out.println("After Subtract 7 the Output will be "+j8);

        // task  25



        final int ag;

        ag=34;

        System.out.println(ag);



        // task 26 
        int a7;
        
        System.out.println("enter a number");
        a7 = sc.nextInt();

        a7++;

        System.out.println("After Increment The Output will be"+a7);


        // task 27

        int g0;

        System.out.println("Enter a number");
        g0 = sc.nextInt();

        g0--;

        System.out.println("After Decrement The Output will be"+g0);


        // task 28

        byte kg;
        System.out.println("Enter a byte value");
        kg= sc.nextByte();

        System.out.println("The byte value will be"+kg);

        // task 29

        short joy;
        System.out.println("Enter a Short Value");
        joy=sc.nextShort();

        System.out.println("The Output will be"+joy);


        // task 30

        long king;
        System.out.println("Enter a long value");
        king = sc.nextLong();

        System.out.println("The output will be "+king);



        













    }

 } 