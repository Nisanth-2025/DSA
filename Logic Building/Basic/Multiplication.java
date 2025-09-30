import java.util.Scanner;

public class Multiplication{
    public static void multiply(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" * "+num+" = "+i*num);
        }
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        multiply(num);
        sc.close();
    }
}
