public class Factorial {
    public static void binToDec(int binNum){
        int pow =0;
        int decimal=0;
        while(binNum>0){
            int lastDigt =binNum%10;
            decimal = decimal+(lastDigt*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal Number:"+decimal);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
    }
