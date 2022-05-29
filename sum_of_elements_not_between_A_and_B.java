import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=0;
        for(i=0;i<n;i++)
        if(x[i]<a||x[i]>b)
        sum=sum+x[i];
        System.out.println(sum);
    }
}