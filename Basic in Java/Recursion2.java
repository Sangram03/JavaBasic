public class Recursion2 {
        public static void printNumber(int n){
            //base case
            if(n==6){
                return;
            }
            System.out.println(n);
            printNumber(n+1);
        }
        public static void main(String[] args) {
            int n=1;
            printNumber(n);//n=1
        }
    }

    //main f(x)---> 1
    // base condition --> n(sum point)
    // "kaam"-work --> calculate sum
    
