import java.util.Scanner;

public class NewOperation {
    public static void main(String[] args) {
        // Create a new operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st VAlue  :");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Value :");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println(" A isGreater");
                System.out.println("I am a good boy");
            }
            else{
                System.out.println("B is Greater");
            }
        }

    }
}
