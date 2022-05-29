import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        int n,i,f=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,y;
        a=sc.nextInt();
        y=sc.nextInt();
        for(i=0;i<n;i++)
        {
        if(x[i]>=a&&x[i]<=y)
   {
       System.out.printf("%d ",x[i] );
       f=0;
   }
        }
   if(f!=0)
   System.out.println("-1");
        
        
       
    }
}