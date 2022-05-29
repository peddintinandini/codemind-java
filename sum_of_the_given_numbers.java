import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int x[],j,k;
            x=new int[n];
            for(j=0;j<2;j++)
            {
                x[j]=sc.nextInt();
            }
            k=x[0]+x[1];
            System.out.printf("%d
",k);
        }
    }
}