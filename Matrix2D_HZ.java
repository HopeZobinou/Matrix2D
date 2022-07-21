/**
 * Hope Zobinou     
 *
 * This prints out 5 rows and 10 collumns of random numbers all stored into an array
 * then prints out the squares of the random numbers previously printed.
 */
public class Matrix2D_HZ
{
    public static void main(String[]args)
    {
        int rows = 5;
        int collumns = 10;
        int[][] Numbers = new int[rows][collumns];
        int RandomNumbers = 0;
        System.out.println("The numbers ...");
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < collumns; c++)
            {
                RandomNumbers = (int) (Math.random() * 10) + 0;
                Numbers[r][c] = RandomNumbers;
                System.out.printf("%2d ",Numbers[r][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("And their squares ...");
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < collumns; c++)
            {
                Numbers[r][c] = (int) Math.pow(Numbers[r][c], 2);
                System.out.printf("%2d ",Numbers[r][c]);
            }
            System.out.println();
        }

    }
}
