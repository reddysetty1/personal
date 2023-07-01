
interface hello1
{
    public void getInvite(); //abstract method
    default void getInvitation() //These are by default public and this access modifier cannot be changed
        {
        System.out.println("This is a default method in the interface");
        }
}
class access_hello1 implements hello1
{
    public void getInvite()
    {
        System.out.println("Hello from the abstract method accessing through access_hello1");
    }
}

public class example1
{
    public static void main(String[] args)
    {
        access_hello1 ah = new access_hello1();
        ah.getInvite();
        ah.getInvitation();
    }
}
