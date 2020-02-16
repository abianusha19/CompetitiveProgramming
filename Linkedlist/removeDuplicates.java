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
public class removeDuplicates
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

void removeDuplicateElement()
{
Node temp1=this.head;
Node temp2=this.head;
while(temp1!=null && temp1.next!=null)
{
	temp2=temp1;
while(temp2.next!=null)
{
if(temp1.data==temp2.next.data)
{
	
temp2.next=temp2.next.next;

}
else
{
temp2=temp2.next;
}
}
temp1=temp1.next;
}
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
removeDuplicates k=new removeDuplicates();
for(int i=0;i<totalnodes;i++)
{
int value=sc.nextInt();
k.insertList(value);
}
k.printList();
k.removeDuplicateElement();
System.out.println("After deleting duplicate elements ");
k.printList();
}
}




