import java.util.Scanner;
class Hello {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        int i = 0, count = 0;
        while (n != 0)
        {
            int num = n % 10;
            a[i] = num;
            i++;
            n = n / 10;
        }
        for (int j = 0; j <= i - 1; j++)
        {
            for (int k = j + 1; k <= i - 1; k++)
            {
                if (a[j] == a[k])
                {
                    count++;
                }
            }
        }
        if (count > 0)
        {
            System.out.println("Not Unique Number");
        }
        else
        {
            System.out.println("Unique Number");
        }
    }
}