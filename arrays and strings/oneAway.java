import java.util.*;
import java.util.Collections;
public class oneAway
{
    static boolean checkoneaway(String input1,String input2)
    {
        int length1=input1.length();
        int length2=input2.length();
        if(Math.abs(length1-length2)>1)
        return false;
        int cnt=0,i=0,j=0;
        while(i<length1 && j<length2)
        {
            if(input1.charAt(i)!=input2.charAt(j))
            {
                if(cnt==1)
                  return false;
                if(length1>length2)
                {
                    i++;
                }
                else if(length2>length1)
                 j++;
                else
                {
                    i++;
                    j++;
                    
                }
                cnt++;
                 
            }
            else
            {
                j++;
                i++;
            }
        }
        if(i<length1 || j<length2)
        {
            cnt++;
        }
        return cnt==1;
    }

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input1=sc.next();
	    String input2=sc.next();
	    if(checkoneaway(input1,input2))
	    System.out.println("Yes");
	    else
	    System.out.println("No");
}
}
