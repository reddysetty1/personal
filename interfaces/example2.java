
//Lets do with 2 interfaces

interface hello2
{
    public void getInvite(); //abstract method
    default void getInvitation() //These are by default public and this access modifier cannot be changed
    {
        System.out.println("This is a default method in the interface2");
    }
}

interface hello21
{
    public void getInvite21(); //abstract method
    default void getInvitation21() //These are by default public and this access modifier cannot be changed
    {
        System.out.println("This is a default method in the interface21");
    }
}
class access_hello2 implements hello2, hello21
{
    public void getInvite()
    {
        System.out.println("Hello from the abstract method of interface hello2 accessing through access_hello2");
    }
    public void getInvite21()
    {
        System.out.println("Hello from the abstract method of interface hello21 accessing through access_hello2");
    }
}

public class example2
{
    public static void main(String[] args)
    {
        access_hello2 ah = new access_hello2();
        ah.getInvite();
        ah.getInvite21();
        ah.getInvitation();
        ah.getInvitation21();
    }
}
