import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int num,sum=0,r,k=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>9)
        {
            sum=0;
            while(num>0)
            {
            r=num%10;
            sum=sum+r;
            
            num=num/10;
            }
            num=sum;
        }
        System.out.println(sum);
    }
}