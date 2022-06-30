package Day3;
/*three parameterized constructor
default constructor
one parameterized constructor
two parameterized constructor
four parameterized constructor*/
public class Assignment3 {

	public Assignment3()
	{      
		    this(1,2,3);
			System.out.println("Default Constructor");
	}
	public Assignment3(int b1)
	{
		this();
		System.out.println("one parameterized Constructor");
	}
	public Assignment3(int a, int b)
	{   
		this(1);
		System.out.println("two parameterized Constructor");
	}
	public Assignment3(int x, int y, int z)
	{   
		System.out.println("three parameterized Constructor");
	}
	public Assignment3(int a1, int a2, int a3, int a4)
	{   this(1,2);
		System.out.println("four parameterized Constructor");
	}
	
	public static void main(String[] args)
	{
		Assignment3 A1=new Assignment3(1,2,3,4);
	}
	
	
}
