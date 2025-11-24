package csd;

class App {
	public static void main(String[] args) 
	{
	
	}
}

class Sample {
	public static void foo()  //imza: foo
	{
		//...
				
	}
	
	public static void foo(int a) //imza: foo, int
	{
		//...
				
	}
	
	public static void foo(int a, double b) //imza: foo, int, double
	{
		//...
	}
	
	public static void foo(double a, int b) //imza: foo, double, int
	{
		//...
				
	}
	
	public static void foo(int a, int b) //imza: foo, int, int
	{
		//...
				
	}
	
	public static void bar(int a, int b) //imza: bar, int, int
	{
		//...				
	}
}


