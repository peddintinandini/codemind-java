import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int n1,n2,gcd=1,lcm,i;
        Scanner sc=new Scanner(System.in);
        
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=1;i<=n1&&i<=n2;i++)
        {
            if(n1%i==0&&n2%i==0)
        gcd=i;
        }
        
        System.out.println(gcd);
    }
}