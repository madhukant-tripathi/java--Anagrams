import java.io.*;
public class Anagrams
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int n=s.length();
        char a[]=new char[n];
        for (int i=0;i<n;i++)
            a[i]=s.charAt(i);
        // Bubble Sort
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j>a[j+1])
                {
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int count = 1;
		System.out.print(s+" ");
        while (Permutation(a))
        {
            System.out.print(a);
			System.out.print(" ");
            count++;
        }
        System.out.println();
        System.out.println("Total number of anagrams: " + count);
    }
    static boolean Permutation(char a[])
    {
        int i = a.length-2;
        while (i>=0&&a[i]>=a[i+1])
            i--;
        if (i<0)
            return false;
        int j=a.length-1;
        while(a[j]<=a[i])
            j--;
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        for(int l=i+1,r=a.length-1;l<r;l++,r--)
        {
            temp=a[l];
            a[l]=a[r];
            a[r]=temp;
        }
        return true;
    }
}