package suboltest;

import org.testng.annotations.Test;

public class ClassA {
	@Test(priority =1)	
	public void methodAone()
	{
		
		System.out.println("ClassA- methodAOne");
		
	}
	@Test(priority=2)
	public void methodATwo()
	{
		
		System.out.println("ClassA- methodATwo");
		
	}

	@Test(priority=3)
	public void methodAThree()
	{
		System.out.println("ClassA- methodAThree");
	}
	}



