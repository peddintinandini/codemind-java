import java.util.Scanner;
class teja
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
            String s1=sc.nextLine();
            int c=0;
            for (int j=0;j<s1.length();j++)
            {
                if(Character.isDigit(s1.charAt(j)))
                {
                    c++;
                }
            }
            if (c!=0)
            {
                System.out.println("Contains "+c+" digit");
            }
            else
            {
                System.out.println("Doesn't contain digit");
            }
            
            
        
    }
}