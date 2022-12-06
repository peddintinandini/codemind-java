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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nandu na=new nandu();
        
       
            int n,r,c2=1,c1=0,v,i,j;
            n=sc.nextInt();
            for (i=n+1;i<99999;i++)
            {
                if(na.prime(i)==0)
                {
                    c1=i;
                    break;
                }
            }
            for(j=n;j>0;j--)
            {
                if(na.prime(j)==0)
                {
                    c2=j;
                    break;
                }
            }
            v=Math.abs(n-c1);
            r=Math.abs(n-c2);
            if(v>r)
            System.out.println(r);
            else
            System.out.println(v);
            
        
    }
}