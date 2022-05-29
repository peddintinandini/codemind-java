import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        int x,y,m,k,h;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        k=(int)Math.pow(x,y);
        h=k%m;
        System.out.println(h);
    }
}