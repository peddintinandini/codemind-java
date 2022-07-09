import java.util.Scanner;
class abs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i%2!=0)
            {
                s=s+a[i];
            }
        }
           
        System.out.println(s);
    }
}