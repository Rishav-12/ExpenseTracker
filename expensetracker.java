import java.util.Scanner;
public class expensetracker
{
    public static void main(String args[])
    {    
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many persons are there ? ");
        int n = sc.nextInt();
        int[] amounts = new int[n];
        for(int i = 1; i <= n; i++)
        {
            System.out.print("How much did person " + i + " pay ? ");
            int r = sc.nextInt();
            amounts[i - 1] = r;
        }
        for(int i = 0; i < amounts.length; i++)
        {
            sum += amounts[i];
        }
        int each = sum / n;
        System.out.println("\nEach person must contribute " + each);
        System.out.println();
        for(int i = 0; i < amounts.length; i++)
        {
            int payable = each - amounts[i];
            if (payable < 0)
            {
                System.out.println("Person " + (i + 1) + " will get " + Math.abs(payable));
                System.out.println();
            }
            else
            {
                System.out.println("Person " + (i + 1) + " has to pay " + payable);
                System.out.println();
            }
        }
    }
}
