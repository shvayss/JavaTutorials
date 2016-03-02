/**
 * Created by Alex.Shvayka on 3/2/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        boolean myBoolean = 4 > 5;
        System.out.println(myBoolean);

        int value = 0;
        boolean loop;
        while (value < 10)
        {
            value = value + 1;
            loop = value < 10;
            System.out.println("Hello: " + value + " --> " + loop);
        }
    }
}
