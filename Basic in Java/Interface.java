interface Message{
    void message1();
    void message2();
}
class A implements Message
{
     public void message1()
    {
        System.out.println("Hello");
    }
    public void message2()
    {
        System.out.println("Bye");
    }
}
     public class Interface{
    public static void main(String[] args) {
        A a=new A();
        a.message1();
        a.message2();
    }
}
