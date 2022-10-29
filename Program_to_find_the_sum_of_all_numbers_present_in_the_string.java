import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        int sum=0;
        for( int i=0;i<st1.length();i++)
        {
        if (Character.isDigit(st1.charAt(i)))
        {
            sum=sum+st1.charAt(i)-'0';
        }
        }
        System.out.println(sum);
    }
}