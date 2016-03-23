/**
 * Created by Alex.Shvayka on 3/18/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        int value = 7;

        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println("Value0 = " + values[0]);
        System.out.println("Value1 = " + values[1]);
        System.out.println("Value2 = " + values[2]);

        for (int i = 0; i < values.length; i++)
        {
            values[i] = (values[i] + value) * value;
            System.out.printf("\nValue%d = %d", i, values[i]);
        }

        int[] numbers = { 5, 6, 7 };

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("\nNumber%d = %d", i, numbers[i]);
        }
    }
}
