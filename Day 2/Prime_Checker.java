import java.util.*;

public class Prime_Checker
{
    public static void main (String[]args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter number to check prime:");
        int num = reader.nextInt();

        boolean IsPrime = true;
        if(num<=1)
        IsPrime=false;

        else
        {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if((num%i==0))
            {
                IsPrime=false;
            }
            else
            {
                IsPrime=true;
            }
        }
        }

        if(IsPrime)
        {
            System.out.println("It's a Prime Number");
        }
        else
        {
            System.out.println("It's not a Prime number");
        }
    }
}