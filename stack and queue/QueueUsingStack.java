import java.util.*;
class QueueUsingStack
{
Stack<Integer> stack1=new Stack<Integer>();
Stack<Integer> stack2=new Stack<Integer>();

void push(Stack<Integer> realStack,int value)
{
realStack.push(value);
}

int pop(Stack<Integer> realStack)
{
if(realStack.empty())
{
System.out.println("Stack is empty");
return -1;
}
return realStack.pop();
}

void enqueue(int value)
{
push(stack1,value);
}

int dequeue()
{
if(stack1.empty() && stack2.empty())
{
System.out.println("Stack is empty");
return -1;
}
while(!stack1.empty())
{
int x=pop(stack1);
push(stack2,x);
}
int top=pop(stack2);
return top;
}

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
QueueUsingStack st=new QueueUsingStack();
int testcases=sc.nextInt();
for(int i=0;i<testcases;i++)
{
String action=sc.next();
if(action.equals("enqueue"))
{
int value=sc.nextInt();
  st.enqueue(value);
  }
  else if(action.equals("dequeue"))
  {
  System.out.println("Front Element of Queue is : "+st.dequeue());
  }
}
}
}






