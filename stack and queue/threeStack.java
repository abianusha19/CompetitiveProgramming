import java.util.*;
class threeStack
{
int stackPointer1=0;
int stackPointer2=0;
int stackPointer3=0;
int stack[]=new int[10];
void insert(int stackId,int value)
{
if(stackId==1 && stackPointer1<10)
{
stack[stackPointer1]=value;
stackPointer1++;
stackPointer2++;
stackPointer3++;
}
else if(stackId==2 && stackPointer2<10)
{
stack[stackPointer2]=value;
stackPointer2++;
stackPointer3++;
}
else if(stackId==3 && stackPointer3<10)
{
stack[stackPointer3]=value;
stackPointer3++;
}
}
void printStack()
{
	for(int i=0;i<stackPointer3;i++)
	{
		System.out.print(stack[i]+" ");
	}
	System.out.println("\n");
}

void pop(int stackId)
{
if(stackId==1&& stackPointer1>0)
{
for(int i=stackPointer1-1;i<stack.length-1;i++)
  stack[i]=stack[i+1];
stackPointer1--;
stackPointer2--;
stackPointer3--;
}
else if(stackId==2&& stackPointer2>0)
{
for(int i=stackPointer2-1;i<stack.length-1;i++)
  stack[i]=stack[i+1];
stackPointer2--;
stackPointer3--;
}
else if(stackId==3&& stackPointer3>0)
{
for(int i=stackPointer3-1;i<stack.length-1;i++)
  stack[i]=stack[i+1];
stackPointer3--;
}
}



public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int noOfTestcases=sc.nextInt();
threeStack ts=new threeStack();
for(int i=0;i<noOfTestcases;i++)
{
String option=sc.next();
int stackId=sc.nextInt();

if(option.equals("push"))
{
int value=sc.nextInt();
ts.insert(stackId,value);
ts.printStack();
}
if(option.equals("pop"))
{
ts.pop(stackId);
}
}
ts.printStack();
}
}


