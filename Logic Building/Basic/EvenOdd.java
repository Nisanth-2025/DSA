import java.util.Scanner;

public class EvenOdd
{
    public static String even_odd(int num)
    {
        return((num%2==0)?"Even":"Odd");
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = sc.nextInt();
        System.out.println(even_odd(n));
        sc.close();
    }
}