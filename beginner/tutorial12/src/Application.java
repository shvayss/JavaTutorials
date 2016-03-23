/**
 * Created by Alex.Shvayka on 3/23/2016.
 */
public class Application
{
    public static void main(String[] args)
    {
        int[] values = { 3, 5, 2343 };
        System.out.println(values[2]);

        int[][] grid = {
                { 3, 5, 2343 },
                { 2, 4 },
                { 6, 7, 8, 9 }
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2] + "\n");
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[row].length; col++)
            {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] texts = new String[2][3];
        texts[0][1] = "\nHello there\n";
        System.out.println(texts[0][1]);

        String[][] words = new String[2][];
        System.out.println(words[1]);
        words[0] = new String[3];
        words[0][1] = "Hi there!";
        System.out.println(words[0][1]);
    }
}
