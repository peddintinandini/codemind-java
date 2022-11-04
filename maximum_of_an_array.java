import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int n,i,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for (i=0;i<n;i++)
        {
            if (a[i]>min)
            {
              temp=a[i];
              min=temp;
              
            }
        }
        System.out.print(min);
    }
}