import java.util.Scanner;
class  Convert
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

        }
    }