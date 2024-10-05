
import java.util.Scanner;

class ArrayUse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input size");
        int size =sc.nextInt();
        int numbers[]=new int[size];

        //input
        System.out.println("Enter the element");
        for (int i = 0; i < size; i++) {
            numbers[i]=sc.nextInt();

        }
        System.out.println("Enter the searching element");
        int x = sc.nextInt();

        //output
        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);
        // }

        //main out put for searching
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]== x){
                System.out.println("x found at index :"+i);
            }


            }
        }
    }