import java.util.*;
import java.util.Collections;
public class stringRotation
{
    static boolean isSubstring(String input1,String input2)
    {
        int cnt=0;
        while(true)
        {
            char inputarray[]=input1.toCharArray();
            char ch=inputarray[0];
            for(int i=0;i<input1.length()-1;i++)
            {
                inputarray[i]=inputarray[i+1];
            }
            inputarray[input1.length()-1]=ch;
            input1=String.valueOf(inputarray);
            cnt+=1;
            if(input1.equals(input2))
              return true;
            if(cnt==input1.length())
              return false;
        }
    }
    

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input1=sc.next();
	    String input2=sc.next();
	    if(isSubstring(input1,input2))
	    System.out.println("yes");
	    else
	    System.out.println("no");
}
}
