import java.util.Scanner;

public class SumofN{
    public static int N_naturals(int num)
    {
        int sum = 0;
        for(int i=1;i<=num;i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        System.out.println("Sum = " + N_naturals(num));
        sc.close();
    }
}
