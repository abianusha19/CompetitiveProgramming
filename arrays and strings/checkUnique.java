import java.util.*;
import java.util.Collections;
import java.util.HashSet;
public class checkUnique
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String s=sc.next();
	    int flag=0;
	    HashSet<Character> h=new HashSet();
	    boolean result=false;
	    for(int i=0;i<s.length();i++)
	    {
	        result=h.add(s.charAt(i));
	        if(result==false)
	        {
	            flag=1;
	            break;
	        }n 
	    }
	    if(flag==0)
	    System.out.println("only unique characters present");
	    else
	    System.out.println("Has repeating characters");
	    }
}

