import java.util.Scanner;

public class OddEven
{
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number to check Odd or Even");
        int num= reader.nextInt();
        String print = ((num&1)==1)?"Odd":"Even";
        System.out.println(num +" is "+ print);
    }
}