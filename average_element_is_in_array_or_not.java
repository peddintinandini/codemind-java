import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,e,f=0;
        float avg=0,s=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        avg=(int)s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}