//2d Matrix search
import java.util.*;

public class MatrixSearch
{
    public static void main (String[]args)
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

        System.out.println("Enter number to find in this matrix");
        int searc=reader.nextInt();
        boolean value=false;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(searc==a[i][j])
                {
                    value=true;
                    break;
                    //System.out.print("Found!!");
                }
            }
            if(value)
            break;
        }
              if (value) {
            System.out.println("Found!!");
        } else {
            System.out.println("Sorry, Not Found!!");
        }
    }
}