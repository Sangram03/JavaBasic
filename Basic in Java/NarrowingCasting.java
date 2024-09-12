public class NarrowingCasting {
    public static void main(String[] args) {
        double myDouble =9.78d;
        int myInt =(int)myDouble;//manual casing : double to int



        System.out.println(myDouble);
        System.out.println(myInt);



        int maxScore =500;

        int userScore = 423;


        float percentage = (float)userScore / maxScore *100.0f;

        System.out.println("User's Percentage:" +percentage);
    }
}
