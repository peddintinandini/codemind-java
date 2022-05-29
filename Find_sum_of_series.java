import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n,i,s=0;
        n=sc.nextFloat();
        for(i=1;i<=n;i++)
        s=s+(float)(1/i);
        System.out.printf("%.2f",s);
    }
}