//2d matrix addition
import java.util.*;

public class MatrixMultiplication
{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter rows");
        int row= reader.nextInt();

        //Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter columns");
        int columns= reader.nextInt();

        int [][]a= new int[row][columns];
        int [][]b=new int [row][columns];
        int [][]sum=new int [row][columns];

        System.out.println("Enter A Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                //Scanner reader3 = new Scanner (System.in);
                a[i][j]=reader.nextInt();
            }
        }

        System.out.println("Enter B Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                //Scanner reader3 = new Scanner (System.in);
                b[i][j]=reader.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                sum[i][j]=a[i][j]*b[i][j];
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}