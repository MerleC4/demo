
/**
 * An introduction to return methods.
 *
 * @author Merle Crutchfield
 * @version 10/17/18
 */
public class ReturnMethods
{
    public static void main(String [] args)
    {
        sayHello();
        int x = add(2, 4);
    }
    public static void sayHello()
    {
        System.out.println("Hello");
    }
    public static int add(int a, int b)
    {
        int c = a + b;
        return c;
    }
}
