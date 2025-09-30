import java.util.Scanner;

public class Swap2Num {
    public static void swap_num(int num1,int num2)
    {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("--- After Swap ---");
        System.out.println("num 1 = "+num1);
        System.out.println("num 2 = "+num2);
    }

    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the 1st Number : ");
        num2 = sc.nextInt();
        System.out.println("--- Before Swap ---");
        System.out.println("num 1 = "+num1);
        System.out.println("num 2 = "+num2);
        swap_num(num1,num2);
        sc.close();
    }
}
