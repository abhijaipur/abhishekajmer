package Day2;

public class Assignment2 {
	
	//((((10/2)-2)-2)+2)*2)
	
	 public int div (int a, int b)
	    {
	    	int c=a/b;
	    	System.out.println("The value of Div is " + c);
	    	return c;
	    }
	    
	 public int min(int x, int y)
     {
 	
 	int z= x-y;
 	System.out.println("The value of Min is " + z);
 	return z; 	
     }
 	
	public int Sum(int a, int b)
	{
	int c;
	c = a+b;
	System.out.println("The value of Sum is " + c);
	return c;
	}
	
	public void  Mul(int x, int y)
	{
		int z=x*y;
		System.out.println("The value of Multi is "+ z);
		
	}
	 
    public static void main (String[] args)
    {
    	Assignment2 b=new Assignment2();
    	int DivResult = b.div(10, 2);
    	int MinResult = b.min(DivResult, 2);
        int FinalResult = b.min(MinResult,2);
        int SumResult = b.Sum(FinalResult, 2);
        b.Mul(SumResult, 2);
    }
}