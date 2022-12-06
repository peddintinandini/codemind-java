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
        int n,r,c2=0,c1=0;
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            r=n%10;
            if(na.prime(r)==0)
            {
                c1+=1;
            }
            c2+=1;
            n=n/10;
        }
        if(na.prime(temp)==0 && c1==c2)
        {
          System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
            
      
        
    }
}