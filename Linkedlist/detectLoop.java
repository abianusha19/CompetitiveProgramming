import java.util.*;
class Node
{
int data;
Node next;
Node(int value)
{
data=value;
}
}
public class detectLoop
{
Node head;

void insertList(int value)
{
Node newnode=new Node(value);
Node temp=this.head;
if(this.head==null)
{
this.head=newnode;
}
else
{
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=newnode;
}
}

 


int detectLoopoccurance()
{
Node temp=this.head;
Node slow=this.head;
Node fast=this.head;
while(slow!=null && fast!=null && fast.next!=null && fast.next.next!=null)
{
	slow=slow.next;
	fast=fast.next.next;
	if(slow==fast)
	{
		slow=head;
		while(slow!=fast)
		{
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
	}
	
}
return 0;
}

void printList()
{
	Node temp=this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	
	}
	System.out.println("NULL");
}

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int totalnodes=sc.nextInt();
detectLoop k=new detectLoop();
for(int i=0;i<totalnodes;i++)
{
int value=sc.nextInt();
k.insertList(value);
}
//k.head.next.next.next.next= k.head.next;

int res=k.detectLoopoccurance();
if(res!=0)
	System.out.println(res);
else
	System.out.print("No loop");
}
}




