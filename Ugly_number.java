import java.util.Scanner;
class Sample
{
    public static  String findugly(int num)
    {
       int flag=0;
       while(num>0)
       {
           flag=0;
           if(num%5==0)
           {
               num=num/5;
               flag=1;
           }
           if(num%3==0)
           {
               num=num/3;
               flag=1;
           }
           if(num%2==0)
           {
               num=num/2;
               flag=1;
           }
           if(flag==0||num==1)
           break;
       }
       if(num==1)
       return "Ugly Number";
       else
       return "Not Ugly Number";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String result=Sample.findugly(n);
        System.out.println(result);
    }
}