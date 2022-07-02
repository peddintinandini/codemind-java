import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,c;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            c=(int)Math.sqrt(a[i]);
            if(c*c==a[i])
            s=s+a[i];
        }
        System.out.println(s);
    }
}