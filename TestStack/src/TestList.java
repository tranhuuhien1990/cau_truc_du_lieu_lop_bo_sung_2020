
public class TestList {
	Node head; 
	static class Node{
		int data;
		Node next;
		Node(){
			next = null;
		}
		Node(int x){
			data = x;
			next = null;
		}
	}
	TestList(){
		head = new Node();
		head.next=null;
	}
	public void addFirt( int x){
		Node t = new Node(x);
		t.next=this.head.next;
		this.head.next=t;
		
	}
	void  printList(){
		Node p=this.head;
		while(p.next!=null){
			System.out.println(p.next.data+" ");
			p=p.next;
		}
	}

	public static void main(String[] args) {
		TestList c = new TestList();
		c.addFirt(5);
		c.addFirt(10);
		c.addFirt(15);
		c.addFirt(20);
		c.printList();

	}
}

