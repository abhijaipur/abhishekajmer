package Day2;

public class Assignment1 {
	
	//((((10+2)+2)-2)*2)/2)
	
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
    
    public void div (int b1, int b2)
    {
    	int b3=b1/b2;
    	System.out.println("The value of Div is " + b3);
    }
    
    public static void main (String[] args)
    {
    	Assignment1 a=new Assignment1();
    	int SumResult=a.Sum(10, 2);
		int Final = a.Sum(SumResult, 2);
		int MinResult = a.min(Final, 2);	
		int MulResult = a.Mul(MinResult,2);
		a.div(MulResult,2);
		
		
    	
    }
}
