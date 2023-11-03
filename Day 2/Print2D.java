//2d Matrix print
import java.util.*;

public class Print2D
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter rows");
        int row= reader.nextInt();

        //Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter columns");
        int columns= reader.nextInt();

        int [][]a= new int[row][columns];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                //Scanner reader3 = new Scanner (System.in);
                a[i][j]=reader.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}