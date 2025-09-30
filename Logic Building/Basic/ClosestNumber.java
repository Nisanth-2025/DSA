import java.util.Scanner;

public class ClosestNumber {

     static int closestNumber(int n, int m)
     {
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        else
        {
             return n2;  
        }    
    }
    public static void main(String[] args)
    {
        int num,div;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        System.out.print("Enter a Divisor : ");
        div = sc.nextInt();
        System.out.println("The closest number is " + closestNumber(num,div));
        sc.close();
    }
}
