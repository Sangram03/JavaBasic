class Rectangle
{
    int l,b;
    void disp_lb()
    {
        System.out.println("l="+l+",b="+b);
    }
}
class Cuboid extends Rectangle
{
    int h;
    void disp_h()
    {
        System.out.println("h="+h);
    }
    void find_volume()
    {
        System.out.println("Volume="+l*b*h);
    }

}


public class SingleInheritance {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        c.l=9;
        c.b=7;
        c.h=3;
        c.disp_lb();
        c.disp_h();
        c.find_volume();
    }
}
