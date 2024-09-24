

public class Ex {
    public static void main(String[] args) {
        int x,y;
        try {
            x=0;
            y=1/x;
            System.out.println("This will be not printed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division  by Zero");
        }
        System.out.println("After catch statement.");
    }
}
