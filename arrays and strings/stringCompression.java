import java.util.*;
import java.util.Collections;
public class stringCompression
{
   static void compressString(String input)
   {
       String result="";
       int cnt=1;
       result+=input.charAt(0);
       for(int i=1;i<input.length();i++)
       {
           char ch=input.charAt(i);
           if(result.charAt(result.length()-1)==ch)
           {
             cnt+=1;
           }
           if(result.charAt(result.length()-1)!=ch)
           {
               result+=cnt;
               result+=ch;
               cnt=1;
           }
           if( i+1==input.length())
           result+=cnt;
           

             
       }
       System.out.println(result);
   }
    

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input=sc.next();
	    compressString(input);
}
}
