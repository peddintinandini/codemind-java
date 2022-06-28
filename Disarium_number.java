import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n,i,num,d=0,s=0,r;
         n=sc.nextInt();
         num=n;
         while(num>0)
         {
             d++;
             num=num/10;
             
         }
         num=n;
         while(num>0)
         {
             r=num%10;
             s=s+(int)Math.pow(r,d);
             num=num/10;
              d--;
         }
         if(s==n)
         System.out.println("True");
         else
         System.out.println("False");
    }
}