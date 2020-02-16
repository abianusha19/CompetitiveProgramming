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
public class deleteMiddle
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

void deleteMiddleNode()
{
Node slow=this.head;
Node fast=this.head;
Node prev=this.head;
while(fast!=null && fast.next!=null && fast.next.next!=null)
{
prev=slow;
slow=slow.next;
fast=fast.next.next;
}
prev.next=slow.next;
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
deleteMiddle k=new deleteMiddle();
for(int i=0;i<totalnodes;i++)
{
int value=sc.nextInt();
k.insertList(value);
}
k.printList();
k.deleteMiddleNode();
System.out.println("After deleting middle element ");
k.printList();
}
}




