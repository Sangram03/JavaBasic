
import java.util.Scanner;

public  class NumberToWord{
    public static String convertToWords(int num){
        if(num<0 || num>99){
            return "Number is Out of Range !";
        }
        String[] tensNames ={"","ten","twenty","thirty","forty","fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] numNames ={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","sixteen",
    "seventeen","eighteen","nineteen"};

    if(num<20){
        return numNames[num];
    }

    int tens = num/10;
    int units = num%10;
    if(units ==0){
        return  tensNames[tens];
    }
    else
    {
        return tensNames[tens]+"-"+numNames[units];
    }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(convertToWords(num));
    }
}