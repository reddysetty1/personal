//Creating 2 interfaces
interface Area
{
    int a =3; //This is just an example to show you that by default the fields in interface are public static final
    public void getArea(); //abstract method
    static void method()
    {
        System.out.println("THis is a static method");
    }
}
interface Perimeter
{
    public void getPerimeter(); //abstract method
}
//Showing how to inherit interfaces from parent interfaces using extends.
//A class cannot inherit/extend from interface
interface calculation extends Area,Perimeter
        {
            public void getArea(); //abstract method
            public void getPerimeter();
        }

//Implementing the features of interface to a class but implementing its abstract methods
class Rectangle implements calculation
{
    int l = 4;
    int b = 2;
    public void getArea()
    {
        System.out.println("Area of rect: "+(l*b));
    }
    public void getPerimeter()
    {
        System.out.println("Permeter of Rect: "+(2*(l+b)));
    }
}
class Square implements calculation
{
    int l = 4;

    public void getArea()
    {
        System.out.println("Area of rect: "+(l*l));
    }
    public void getPerimeter()
    {
        System.out.println("Permeter of Rect: "+(4*l));
    }
}

public class example3
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.getArea();
        r.getPerimeter();
        Square s = new Square();
        s.getArea();
        s.getPerimeter();
        Area.method();//Accessing a static method from the interface directly as creating objects of interface is not possible
    }
}
