
/**
 * More coding problems
 *
 * @author Merle Crutchfield
 * @version 10/18/18
 */
public class CodingProblemsTwo
{
    public static void main(String [] args)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; i< 5; i++)
            {
                System.out.println("*****");
            }
        }
        System.out.println("");
        for (int i=0; i < 5; i++)
        {
            for (int j = 0; j < 5 - i; i++)
            {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
