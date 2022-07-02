package Day5;

/*parent 3 parameterized constructor
parent default constructor
parent 4 parameterized constructor
parent 2 parameterized constructor
parent 1 parameterized constructor
child 2 parameterized 
child default constructor
child 3 parameterized constructor
child 4 parameterized constructor
child 1 parameterized constructor*/

public class Assignment5A extends Assignment5 {
	
	public Assignment5A()
	{
	this(1,2);
	System.out.println("Child default construcor");	
	}
	public Assignment5A(int a2)
	{
		this(1,2,3,4);
		System.out.println("Child 1 parameterized constructor");	
	}

	public Assignment5A(int a3,int a4)
	{
		super(1);
		System.out.println("Child 2 parameterized constructor");
	}

	public Assignment5A(int x2, int y2, int z2)
	{
	    this();
		System.out.println("Child 3 parameterized constructor");	
	}

	public Assignment5A(int x1a, int x2a, int x3a, int x4a)
	{
		this(1,2,3);
		System.out.println("Child 4 parameterized constructor");	
	}

	public static void main (String[] args)
	{
		Assignment5A obj = new Assignment5A(1);
	}

}
