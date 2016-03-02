/**
 * Created by Alex.Shvayka on 3/2/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello: " + i);
            System.out.println("The value of i is: " + i);
            System.out.printf("The value of i is: %d (printf)\n", i);
        }
    }
}