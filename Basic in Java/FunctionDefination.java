
import java.util.Scanner;

public class FunctionDefination {
    /*
     * returnType functionName(type arg1,type arg2){
     ? operation
     ! returnType may be int ,float, string
     ? void :- no return
     ? no keyword
     * public
     * static 
     * }
     */
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String name =sc.next();
         printMyName(name);// call the function 

     }
}
