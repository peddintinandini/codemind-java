import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<k;i++)
        {
            String s1=sc.nextLine();
            int c=0;
            for (int j=0;j<s1.length();j++)
            {
                if(Character.isDigit(s1.charAt(j)))
                {
                    c++;
                }
            }
            if (c==0)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
    }
}