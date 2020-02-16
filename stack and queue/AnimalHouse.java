import java.util.*;
class Node
{
	String data;
	Node next;
	int arrivaltime;
	Node(String value,int time)
	{
		data=value;
		arrivaltime=time;
	}
}
class AnimalHouse
{
	Node head;
	
	void insert(String value,int time)
{
Node newnode=new Node(value,time);
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

String deQueue()
{
	if(head!=null)
	{
String ans=this.head.data;
this.head=this.head.next;
return ans;
	}
return "-1";
}

String dequeueAny(AnimalHouse dog,AnimalHouse cat)
{
	String ans="-1";
	if(dog.head.arrivaltime<cat.head.arrivaltime)
	{
 ans=dog.head.data;
dog.head=dog.head.next;

	}
else if(dog.head.arrivaltime>cat.head.arrivaltime)	
{
	ans=cat.head.data;
cat.head=cat.head.next;

	}
	return ans;
}

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int testcases=sc.nextInt();
AnimalHouse cat=new AnimalHouse();
AnimalHouse dog=new AnimalHouse();
AnimalHouse common=new AnimalHouse();
int time=0;
for(int i=0;i<testcases;i++)
{
String animal=sc.next();
String action=sc.next();
if(animal.equals("cat") && action.equals("insert"))
{
	String animalname=sc.next();
	
  cat.insert(animalname,time);
  time++;
}
else if(animal.equals("dog") && action.equals("insert"))
{
	String animalname=sc.next();
  dog.insert(animalname,time);
  time++;
}
else if(animal.equals("cat")&& action.equals("dequeue"))
{
	System.out.println(cat.deQueue());
}
else if(animal.equals("dog") && action.equals("dequeue"))
{
	System.out.println(dog.deQueue());
}
else if(animal.equals("any") && action.equals("dequeue"))
{
	System.out.println(common.dequeueAny(cat,dog));
}
}
}
}

	