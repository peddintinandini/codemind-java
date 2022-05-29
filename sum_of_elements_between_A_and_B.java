import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,y;
        a=sc.nextInt();
        y=sc.nextInt();
        int sum=0;
        for(i=0;i<n;i++)
        if(x[i]>=a&&x[i]<=y)
    sum=sum+x[i];
        
        
        System.out.println(sum);
    }
}