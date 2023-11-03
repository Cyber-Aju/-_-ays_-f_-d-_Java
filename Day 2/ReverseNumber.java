import java.util.*;

public class ReverseNumber
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number to reverse:");
        int n = reader.nextInt();

        System.out.println(Reverse(n));
    }

    public static int Reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int y=n%10;
            rev=(rev*10)+y;
            n/=10;
        }
        return rev;
    }
}