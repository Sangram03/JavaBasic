
public class Pattern2 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.print("Enter First value :");
        int n=66 ;
        // n=sc.nextInt();
        int m=76 ;
        // System.out.print("Enter Second Value : ");
        // m=sc.nextInt();
        
        // ! outer loop
        for (int i=1;i>=n;i--){
            // ! inner loop
            for(int j=1;j>=m;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
