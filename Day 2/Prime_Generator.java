import java.util.*;

public class Prime_Generator
{
    public static void main(String [] args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter range to generate Prime numbers:");
        int num = reader.nextInt();

        for(int i=2;i<=num;i++)
        {
            if(IsPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    public static boolean IsPrime(int n)
        {
            if(n<=1)
            return false;

            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
}