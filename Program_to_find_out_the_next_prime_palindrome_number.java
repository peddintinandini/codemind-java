import java.util.Scanner;
class nandu
{
    public int primes(int n)
    {
        int i,c=0;
        if (n==1){
            c=1;
            
        }
        for(i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
              c=1;
              break;
            }
        }
        return c;
    }
    public int pal(int n)
    {
        int temp,r,rev=0;
        temp=n;
        while(n>0)
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
        
        for(i=n+1;i<99999;i++)
        {
            if (na.primes(i)==0 && na.pal(i)==1)
            {
             System.out.println(i);
             break;
            }
        }
        
        
        
    }

}