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
public class checkPalindrome
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

boolean checkPalindromeList()
{
Node temp=this.head;
Stack<Integer> s=new Stack<Integer>();

while(temp!=null)
{
s.push(temp.data);

temp=temp.next;
}
temp=this.head;
while(temp!=null)
{
	if(temp.data==s.peek())
	{
      s.pop();
	}
temp=temp.next;
}
if(s.isEmpty())
 return true;
else
  return false;
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
checkPalindrome k=new checkPalindrome();
for(int i=0;i<totalnodes;i++)
{
int value=sc.nextInt();
k.insertList(value);
}
k.printList();
if(k.checkPalindromeList())
	System.out.println("Palindrome");
else
	System.out.println("Not a Palindrome");
	

}
}




