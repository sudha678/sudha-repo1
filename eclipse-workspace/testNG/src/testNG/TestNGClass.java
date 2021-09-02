package testNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass
{
	@AfterTest
	public void test()
	{
		
	

	System.out.println(" after test2");

	}
	@BeforeTest
	public void test1()
	{
		
	

	System.out.println("before test2");

	}
	@Test
	public void test2()
	{
		
	

	System.out.println("test2-part1");

	}
	@Test
	public void test3()
	{
		
	

	System.out.println("test2-part2");

	}
	@AfterTest
	public void test4()
	{
		
	

	System.out.println("After Test");

	}
	
	
	

}
