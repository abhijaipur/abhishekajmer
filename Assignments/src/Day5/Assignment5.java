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

public class Assignment5 {
	
			public Assignment5()
			{
			this(1,2,3);
			System.out.println("parent default construcor");	
			}
			public Assignment5(int a)
			{ 
				this(1,2);
				System.out.println("parent 1 parameterized constructor");	
			}

			public Assignment5(int a1,int a2)
			{
			   this(1,2,3,4);
				System.out.println("parent 2 parameterized constructor");	
			}

			public Assignment5(int x, int y, int z)
			{
				
				System.out.println("parent 3 parameterized constructor");	
			}

			public Assignment5(int x1, int x2, int x3, int x4)
			{
			    this();
				System.out.println("parent 4 parameterized constructor");	
			}


}
