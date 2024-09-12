
import java.util.Scanner;

public class hii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d,e;
        int f_mark;
        int t_mark=500;
        System.out.println("Mark-1");
        a=sc.nextInt();
        System.out.println("Mark-2");
        b=sc.nextInt();
        System.out.println("Mark-3");
        c=sc.nextInt();
        System.out.println("Mark-4");
        d=sc.nextInt();
        System.out.println("Mark-5");
        e=sc.nextInt();

        f_mark=a+b+c+d+e;
        System.out.println("TotaL Mark" +f_mark);
        int percentage=(f_mark*100)/500;
        System.out.println("Obtain Percentage"+percentage);

    }
    
}
