//class object
class pen{
    String color;
    String type; // ballpoint; gel

    //function calling
    // Without declare the variable type

    public void write(){
        System.out.println("Write Something");

    }
    // using this keyword
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

// Main function
public  class opps {

    public static void main(String[] args) {
        pen pen1 =new pen();
        pen1.color ="blue";
        pen1.type="gel";


        pen pen2 = new pen();
        pen2.color="black";
        pen2.type="ballpoint";



        pen1.write();
        pen2.printColor();
        pen1.printType();
    }
}