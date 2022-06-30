package Day1;

public class Student {

	int age;
	int rollno;
	
	public void display1()
	{
	 System.out.println("Welcome To all");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main (String[] args)
	{
		
		Student Abhishek = new Student();
		Abhishek.age = 18;
		System.out.println("Student Age is " + Abhishek.age);
		Abhishek.rollno=1;
		System.out.println("The Roll no is "+ Abhishek.rollno);
		Abhishek.display1();
		Abhishek.display2();
		
	}
}


