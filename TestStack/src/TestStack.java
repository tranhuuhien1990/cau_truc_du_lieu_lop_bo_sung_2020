import java.io.*;

public class TestStack {
	Node top;
	
	public static class Node
	{
		double Data;
		Node Next;
		
		public Node()
		{
			Next = null;
		}
		
		public Node(double c)
		{
			Data = c;
			Next = null;
		}
	}
	
	public TestStack()
	{
		top = new Node();
		top.Next = null;
	}
	
	public void push(double c)
	{
		Node n = new Node();
		n.Data = c;
		n.Next = top.Next;
		top.Next = n;
	}
	
	public double pop()
	{
		double c = top.Next.Data;
		
		Node t = top;
		top = t.Next;
		t=null;
		
		return c;
	}
	
	public boolean isEmpty()
	{	
		return top.Next == null;
	}
	
	public void print()
	{
		while( !isEmpty() )
		{
			System.out.print(pop() + " ");
		}
		
		System.out.println();
	}
	
	public void printCharacter(String str)
	{
		int i=0;
		while( i<str.length()  )
		{
			if( Character.isDigit(str.charAt(i)) )
				push( Character.getNumericValue(str.charAt(i)) );
			else
			{
				double a = pop();
				double b = pop();
				
				switch( str.charAt(i) )
				{
					case '+':
					{
						push(a+b);
						break;
					}
					case '-':
					{
						push(a-b);
						break;
					}
					case '*':
					{
						push(a*b);
						break;
					}
					case '/':
					{
						push(a/b);
						break;
					}
					default:
						break;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStack S = new TestStack();
		String str = new String("73+24-*");
		
		int i = 0;
		while(i<str.length())
		{
			S.push(Character.getNumericValue(str.charAt(i)));
			i++;
		}
		S.print();
		
		S.printCharacter(str);
		S.print();
	}

}
