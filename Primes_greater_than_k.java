import java.util.Scanner;
class nandu
{
    public int primes(int n)
    {
        int i,c=0;
        if(n==1)
        {
            c=1;
        }
        for(i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                c+=1;
                
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nandu na=new nandu();
        int n,a[],sum=0,i,c=0,k;
        float v=0;
        n=sc.nextInt();
        a=new int[n];
       
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if (na.primes(a[i])==0)
            {
                if(a[i]>=k)
                c+=1;
                
            }
        }
       
        System.out.println(c);
    }

}