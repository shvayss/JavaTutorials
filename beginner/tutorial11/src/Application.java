/**
 * Created by Alex.Shvayka on 3/23/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        String[] words = new String[3];

        words[0] = "Hello ";
        words[1] = " to ";
        words[2] = "you!\n";

        System.out.println(words[0] + words[1] + words[2]);

        String[] fruits = { "apple", "banana", "pear", "kiwi" };
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        int value = 0;

        String text = null;

        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);

        texts[0] = "one";

        texts[1] = "two";

        for (String textInfo : texts)
        {
            System.out.println(textInfo);
        }
    }
}
