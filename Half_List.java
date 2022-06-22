import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=(n-1);i>=(n/2);i--)
        { 
            System.out.print(a[i]+" ");
        }
        for(i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
