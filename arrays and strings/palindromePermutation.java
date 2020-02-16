import java.util.*;
import java.util.Collections;
public class palindromePermutation
{
    static String permutations="";
    static boolean flag=false;
    static int flag1=0;
    static void findpermutations(String input,int l,int r)
    {
        if(l==r)
        {
          permutations=input;
          flag=checkPalindrome(permutations);
          if(flag)
        {
            flag1=1;
        }
        }
        for(int i=l;i<=r;i++)
        {
            input=swap(input,l,i);
            findpermutations(input,l+1,r);
            input=swap(input,l,i);
        }
    }
    static String swap(String input,int i,int j)
    {
        char ch[]=input.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return String.valueOf(ch);
    }
    static boolean checkPalindrome(String permutations)
    {
        
        String rev=new StringBuilder(permutations).reverse().toString();
          if(rev.equals(permutations))
          {
            return true;
          }
        
        return false;
    }

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input=sc.nextLine();
	    findpermutations(input,0,input.length()-1);
	    if(flag1==0)
	      System.out.println("No");
	    else
	    System.out.println("Yes");
}
}
