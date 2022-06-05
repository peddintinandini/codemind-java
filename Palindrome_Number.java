import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int n,x[],rev=0,i,q,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
          x[i]=sc.nextInt();
          q=x[i];
          rev=0;
          while(x[i]>0)
           {
             
              r=x[i]%10;
              rev=rev*10+r;
              x[i]=x[i]/10;
            }
            if(q==rev)
            System.out.println("True");
            else
            System.out.println("False");
            
        }
        
        
        
    }
}