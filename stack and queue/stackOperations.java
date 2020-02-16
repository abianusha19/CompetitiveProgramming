import java.util.*;
class stackOperations
{
Stack<Integer> stack = new Stack<Integer>(); 
Stack<Integer> minStack = new Stack<Integer>(); 

void pushValue(int value)
{
if(stack.empty())
{
stack.push(value);
minStack.push(value);
}
else if(minStack.peek()>value)
{
stack.push(value);
minStack.push(value);
}
else
{
stack.push(value);
minStack.push(minStack.peek());
}
System.out.println("Item inserted");
}

void popValue()
{
if(stack.empty())
{
System.out.println("Stack is empty");
}

else if(minStack.peek()==stack.peek())
{
stack.pop();
System.out.println(minStack.peek());
minStack.pop();
}
else
{
stack.pop();
}
}

int getMinimum()
{
if(minStack.empty())
{
System.out.println("Stack is empty");
return -1;
}

return minStack.peek();

}

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int testcases=sc.nextInt();
stackOperations so=new stackOperations();
for(int i=0;i<testcases;i++)
{
String action=sc.next();
if(action.equals("push"))
{
int value=sc.nextInt();
  so.pushValue(value);
  }
  else if(action.equals("pop"))
  {
  so.popValue();
  }
}
System.out.println("Minimum Element : " +so.getMinimum());
}
}

  
  

