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
public class findMerge
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



static void FindMergePoint(Node first,Node second)
{
Node temp1=first;
Node temp2=second;
while(temp1!=temp2)
{
	
if(temp1!=null)
temp1=temp1.next;
else
temp1=second;
if(temp2!=null)
temp2=temp2.next;
else
temp2=first;
}
System.out.println("Merge point : "+temp1.data);
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
int totalnodes1=sc.nextInt();
int totalnodes2=sc.nextInt();
findMerge first=new findMerge();
findMerge second=new findMerge();
findMerge result=new findMerge();
for(int i=0;i<totalnodes1;i++)
{
int value=sc.nextInt();
first.insertList(value);
}
for(int i=0;i<totalnodes2;i++)
{
int value=sc.nextInt();
second.insertList(value);
}
second.head.next.next.next = first.head.next.next; 
result.FindMergePoint(first.head,second.head);
}
}




