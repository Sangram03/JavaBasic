class Animal
{
    void eat()
    {
        System.out.println("eating....");
    }
}
 class Dog extends Animal
 {
    void bark()
    {
        System.out.println("barking....");
    }
 }
 class Cat extends Animal
 {
     void meow()
     {
        System.err.println("Meowing....");
     }
 }


public class HierachicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
