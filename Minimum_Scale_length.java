import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int n,i,j,min=-999999,f=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(min<a[i])
            {
                min=a[i];
            }
        }
        for(i=min;i>=1;i--)
        {
            f=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%i!=0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}