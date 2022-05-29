import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int n,s=0,p=1,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        if(s==p)
        {
        System.out.println("Spy Number");
        }
        else
        {
        System.out.println("Not Spy Number");
        }
    }
}