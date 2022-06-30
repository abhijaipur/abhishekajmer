package Day3;

/*three parameterized method
default method
one parameterized method
two parameterized method
four parameterized method*/

public class Assignment4 {
	
	public void m()
	{
		this.m3(1,2,3);
		System.out.println("Default Method");
	}
	public void m1(int a)
	{   
		this.m();
		System.out.println("one parameterized Method");
	}
	public void m2(int a1, int b1)
	{
		this.m1(1);
		System.out.println("two parameterized Method");
	}
	public void m3(int x, int y,int z)
	{
		System.out.println("three parameterized Method");
	}
	public void m4(int b1, int b2, int b3, int b4)
	{
		this.m2(1,2);
		System.out.println("four parameterized Method");
	}
	
	public static void main(String[] args)
	{
		Assignment4 method=new Assignment4();
		method.m4(1, 2, 3, 4);
	}
}
