import java.util.*;
import java.util.Collections;
public class URLify
{
    static String replaceSpace(String input)
    {
        return input.replaceAll(" ","%20");
    } 
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String input=sc.nextLine();
	    System.out.println("replaced string : "+replaceSpace(input));
}
}
