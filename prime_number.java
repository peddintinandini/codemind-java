import java.util.Scanner;
class nandu
{
    public int prime(int n)
    {
        int i,c=0;
        if (n==1)
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
    public int pal(int n){
        int r,rev=0,temp;
        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nandu na=new nandu();
        int n,r,c2=0,c1=0;
        n=sc.nextInt();
        if (na.prime(n)==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}
