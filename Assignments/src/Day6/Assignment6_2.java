package Day6;

import java.util.Scanner;

public class Assignment6_2 {

	// (((((x1*x2)-x3)+x4)-x5)/x6)
	
	public int Sum(int a, int b)
	{
	int c;
	c = a+b;
	System.out.println("The value of Sum is " + c);
	return c;
	}
	
	public int  Mul(int x, int y)
	{
		int z=x*y;
		System.out.println("The value of Multi is "+ z);
		return z;
		
	}
	
    public int min(int a1, int a2)
        {
    	
    	int a3= a1-a2;
    	System.out.println("The value of Min is " + a3);
    	return a3; 	
    }
    
    public int div (int b1, int b2)
    {
    	int b3=b1/b2;
    	System.out.println("The value of Div is " + b3);
    	return b3;
    }
    	
public static void main (String[] args)
{
	// (((((x1*x2)-x3)+x4)-x5)/x6)
	Scanner sc = new Scanner(System.in);
	Assignment6_1 a = new Assignment6_1();
	System.out.println("Please enter value of x1 and x2");
	int x = a.Mul(sc.nextInt(), sc.nextInt());
	System.out.println("Please enter ther value of x3");
	int x1 = a.min(x, sc.nextInt());
	System.out.println("Please enter the value of x4");
	int x2 = a.Sum(x1, sc.nextInt());
    System.out.println("Please enter the value of x5");
    int x3 = a.min(x2, sc.nextInt());
    System.out.println("Please enter the value of x6");
    int x4 = a.div(x3,sc.nextInt());
    
}
}
