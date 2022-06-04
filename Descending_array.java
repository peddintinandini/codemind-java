import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(x[i]<=x[i+1])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("yes");
        else
        System.out.println("no");
        sc.close();
    }
}