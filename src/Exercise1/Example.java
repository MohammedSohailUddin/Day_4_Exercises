package Exercise1;

public class Example
{
	@JsonIgnore(Name="Sohail", DoB="01-08-2000")
	void fun1()
	{
		System.out.println("Test method 1");
	}

	@JsonIgnore(Name="Uddin", DoB="01-08-2000")
	void fun2()
	{
		System.out.println("Test method 2");
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello");
	}
}

//Output:
//	Hello
