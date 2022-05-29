import java.util.Scanner;
class Teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,mul,i,tab;
        n=sc.nextInt();
        mul=sc.nextInt();
        for(i=1;i<=mul;i++)
        {
        if(i%2!=0)
        {
            tab=n*i;
            System.out.printf("%d x %d = %d
",n,i,tab);
        }
        }
    }
}