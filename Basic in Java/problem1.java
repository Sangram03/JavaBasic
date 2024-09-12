//output percentage of a school exam in 5 subject

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5,TotalMark ;
        double InPercentage;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Total Mark :");
        TotalMark=sc.nextInt();


        System.out.print("Enter you 1st Subject Mark :");
        sub1 =sc.nextInt();
        System.out.print("Enter you 2nd Subject Mark :");
        sub2 =sc.nextInt();
        System.out.print("Enter you 3rd Subject Mark :");
        sub3 =sc.nextInt();
        System.out.print("Enter you 4th Subject Mark :");
        sub4 =sc.nextInt();
        System.out.print("Enter you 5th Subject Mark :");
        sub5 =sc.nextInt();
        //InPercentage = ((sub1+sub2+sub3+sub4+sub5)/100)*TotalMark;
        InPercentage = ((sub1+sub2+sub3+sub4+sub5)/(double)TotalMark)*100;
        //int InPercentage2=InPercentage*100;()

        System.out.println("In Percentage "+InPercentage);

        
    }
}
