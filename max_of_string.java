import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        int c=0,i;
        for(i=0;i<ch.length;i++)
        {
            if((int)ch[i]>c)
            {
                c=(int)ch[i];
            }
        }
        System.out.println((char)c);
    }
}