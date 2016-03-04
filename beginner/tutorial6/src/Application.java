/**
 * Created by Alex.Shvayka on 3/2/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        boolean cond = 1 < 6;
        System.out.println(cond);

        boolean cond1 = 1 > 6;
        System.out.println(cond1);

        boolean cond2 = 5 != 2;
        System.out.println(cond2);

        boolean cond3 = 4 == 3;
        System.out.println(cond3);

        if (4 == 4)
        {
            System.out.println("\n1. Yes, it's true!\n");
        }

        int myInt = 15;
        if (myInt < 10)
        {
            System.out.println("2. Yes, it's true!");
        }
        else if (myInt > 20)
        {
            System.out.println("2. No, it's false!");
        }
        else
        {
            System.out.println("Non of the above.\n");
        }

        int loop = 0;
        //while (loop < 5)
        while (true)
        {
            System.out.println("Looping: " + loop);
            if (loop == 5)
            {
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
