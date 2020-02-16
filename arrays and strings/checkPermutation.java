import java.util.*;
import java.util.Collections;
public class checkPermutation
{
    static boolean checkpermute(String input1,String input2)
    {
        int length1=input1.length();
        int length2=input2.length();
        if(length1!=length2)
          return false;
        char[] inputarray1=input1.toCharArray();
        char[] inputarray2=input2.toCharArray();
        Arrays.sort(inputarray1);
        Arrays.sort(inputarray2);
        int cnt=0;
        for(int i=0;i<length1;i++)
        {
            if(inputarray1[i]==inputarray2[i])
            {
                cnt+=1;
            }
            else
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input1=sc.next();
	    String input2=sc.next();
	    if(checkpermute(input1,input2))
	     System.out.println("Two Strings are permutation to each other");
	    else
	      System.out.println("Two Strings are not permutation to each other");
}
}
