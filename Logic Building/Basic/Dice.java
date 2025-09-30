import java.util.Scanner;

public class Dice {
    public static void faces(int n)
    {
        int num = 7-n;
        System.out.println("Opposite face is " + num);
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        faces(num);
        sc.close();
    }
}
