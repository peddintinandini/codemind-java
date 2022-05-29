import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m=1;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        
        for(i=0;i<n;i++)
        if(x[i]<a||x[i]>b)
       {
        System.out.printf("%d ",x[i]);
        m=0;
       }
       if(m!=0)
       System.out.println("-1");
    }
}