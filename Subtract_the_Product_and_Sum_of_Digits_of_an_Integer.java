import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,p=1,sum=0,k,t,r;
        n=sc.nextInt();
        t=n;
        while(t>0)
        {
            r=t%10;
            sum=sum+r;
            p=p*r;
            t=t/10;
        }
        k=p-sum;
        System.out.println(k);
    }
}