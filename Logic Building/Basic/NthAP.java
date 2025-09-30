import java.util.Scanner;

public class NthAP {
    public static int Nth_termof_AP(int num1,int num2,int N)
    {
        int diff = num2 - num1;
        int N_term = num1;
        for(int i =1;i<N;i++)
        {
            N_term += diff;
        }
        return N_term;
    }

    public static void main(String[] args)
    {
        int num1,num2,N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        System.out.print("Enter the N terms : ");
        N = sc.nextInt();
        System.out.println("N terms = " + Nth_termof_AP(num1,num2,N));
        sc.close();
    }
}
