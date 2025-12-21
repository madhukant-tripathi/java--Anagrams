import java.io.*;
class AnagramsRecursion
{
    static int c=1;
    public static void main(String[] args)throws Exception
    {
        String s=new BufferedReader(new InputStreamReader(System.in)).readLine().toUpperCase();
        f("",s);
        System.out.println("\nTotal anagrams: "+(c-1));
    }
    static void f(String p,String s){
        if(s.length()==0)
        {
            System.out.print(p);
            if(c%8==0&&c!=0)
            {
                System.out.println();
            }
            else
            System.out.print(" ");
            c++; 
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.indexOf(s.charAt(i))==i) 
                f(p+s.charAt(i), s.substring(0,i)+s.substring(i+1));
        }
    }
}