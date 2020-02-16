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
public class KthLast
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

int KthLastNode(int k)
{
Node slow=this.head;
Node fast=this.head;
int i=0;
while(i<k)
{
fast=fast.next;
i++;
}
while(fast!=null)
{
slow=slow.next;
fast=fast.next;
}
return slow.data;
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
KthLast k=new KthLast();
for(int i=0;i<totalnodes;i++)
{
int value=sc.nextInt();
k.insertList(value);
}
int position=sc.nextInt();
k.printList();
System.out.println("Kth last Node is : "+k.KthLastNode(position));
}
}




