import java.util.Scanner;
class nandu
{
    public int primes(int n)
    { 
        int r,rev=0,temp;
        temp=n;
        while( n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
       if (temp==rev)
       return 1;
       else
       return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nandu na=new nandu();
        int n,m,i,c1=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if (na.primes(i)==1)
            {
            
             System.out.printf("%d ",i);
            }
        }
        
    }

}