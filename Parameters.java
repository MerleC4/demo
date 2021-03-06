
/**
 * An instruction to using parameters with methods.
 *
 * @author Merle Crutchfield
 * @version 10/16/18
 */
public class Parameters
{
    public static void main(String [] args)
    {
        sayHello("Izzy");
        sayHello("Shane");
        luckyNumber("Matthew", 157);
        
        int [] nums = {1, 4, 82, 21, 64};
        printArray(nums);
        
        String [] names = {"Abe", "Jill", "Bob", "Ellie"};
        printArray(names);
    }
    public static void sayHello(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
    public static void luckyNumber(String name, int highVal)
    {
        int rando = (int)(Math.random() * highVal + 1);
        System.out.println("Hi, " + name + "!");
        System.out.println("Your lucky number between 1 and " + highVal + ":" + rando);
    }
    public static void printArray(int [] arr)
    {
        for (int val:arr)
        {
            System.out.println(val + " ");
        }
        System.out.println();
    }
    public static void printArray(String [] arr)
    {
        for (String val:arr)
        {
            System.out.println(val + " ");
        }
        System.out.println();
    }
    public static void sayHello()
    {
        sayHello("World");
    }
    
}