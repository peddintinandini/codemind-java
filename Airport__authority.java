import java.util.Scanner;
class teja
{
    public static void main (String args[])
    {
        int n,t,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<=t)
            {
                sum=sum+1;
            }
            else
            {
                sum=sum+2;
            }
        }
        System.out.println(sum);
    }
    
}