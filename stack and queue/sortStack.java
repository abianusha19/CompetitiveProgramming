import java.util.*;
class sortStack
{
Stack<Integer> stack = new Stack<Integer>(); 
Stack<Integer> sortedStack = new Stack<Integer>(); 

void pushValue(int value)
{
stack.push(value);
System.out.println("Item inserted");
}

Stack<Integer> sortStackElements()
{
while(!stack.empty())
{
int tmp=stack.pop();
while(!sortedStack.empty() && sortedStack.peek()>tmp)
{
stack.push(sortedStack.pop());
}
sortedStack.push(tmp);
}
return sortedStack;
}

void printStack(Stack<Integer> sortedStack)
{
	String ans="";
while(!sortedStack.empty())
{
ans=String.valueOf(sortedStack.pop())+" "+ans;
}
System.out.println(ans);
}

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int testcases=sc.nextInt();
sortStack ss=new sortStack();
for(int i=0;i<testcases;i++)
{
int value=sc.nextInt();
ss.pushValue(value);
}
Stack<Integer> tempstack=ss.sortStackElements();
ss.printStack(tempstack);
}
}

  
  

