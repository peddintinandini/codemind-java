import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m=1;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        if(x[i]%2==0)
        {
            System.out.printf("%d ",x[i]);
        }
        for(i=0;i<n;i++)
        if(x[i]%2!=0)
        {
            System.out.printf("%d ",x[i]);
        }
    }
}