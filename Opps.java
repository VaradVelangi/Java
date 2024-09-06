import java.util.*;

class Pen{
    String Name;
    String color;

    public void details(){
        System.out.println("Name of product is:"+Name);
        System.out.println("Color of product is:"+color);
    }

    public void printcolor(){
        System.out.println(this.Name);
        System.out.println(this.color);
    }

    //constructor

    Pen(){
        System.out.println("Constructor used");
    }
}

public class Opps {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.Name="Varad";
        p1.color="Blue";
        p1.details();

        Pen p2=new Pen();
        p2.Name="Natraj";
        p2.color="Black";
        p2.printcolor();
    }
}
