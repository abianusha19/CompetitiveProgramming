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
public class sumList
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

void reverseList()
{
Node temp=this.head;
Node dummy=new Node(-1);
Node next;
Node curr=temp.next;
dummy.next=temp;
temp.next=null;
while(curr!=null)
{
next=curr.next;
curr.next=dummy.next;
dummy.next=curr;
curr=next;
}
this.head=dummy.next;
}

static void sumOfTwoLists(Node first,Node second)
{
Node temp1=first;
Node temp2=second;
int sum=0;
int carry=0;
sumList resultList=new sumList();
while(temp1!=null && temp2!=null)
{
sum=(carry+(temp1.data+temp2.data))%10;
carry=(carry+temp1.data+temp2.data)/10;

resultList.insertList(sum);
temp1=temp1.next;
temp2=temp2.next;
}
while(temp1!=null)
{
	resultList.insertList((temp1.data+carry)%10);
	carry=(temp1.data+carry)/10;
	temp1=temp1.next;
}
while(temp2!=null)
{
	resultList.insertList((temp2.data+carry)%10);
	carry=(temp2.data+carry)/10;
	temp2=temp2.next;
}
resultList.reverseList();
resultList.printList();
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
sumList first=new sumList();
sumList second=new sumList();
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
first.printList();
second.printList();
first.reverseList();
second.reverseList();
System.out.println("Sum of two lists :");
sumList.sumOfTwoLists(first.head,second.head);
}
}




