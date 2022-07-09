import java.util.Scanner;
class abs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,se=0,so=0,d=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2==0)
            {
                se=se+a[i];
            }
            else
            {
                so=so+a[i];
            }
        }
        if(so>se)
        {
            d=so-se;
        }
        else
        d=se-so;
        System.out.println(d);
    }
}