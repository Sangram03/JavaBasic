interface SharedConstants
{
     int X=0;
     int Y=1;

}

public class A implements SharedConstants
{
     static void show()
    {
        System.out.println("X="+X+"and Y="+Y);
    }

    public static void main(String[] args) {
        A a=new A();
        show();
    }
}

