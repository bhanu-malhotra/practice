package junit1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitone {

	@Test 
	public void junitmethodone()
	{
		System.out.println("Junit method 1");
		
	}
	
	@Test 
	public void junitmethodthree()
	{
		System.out.println("Junit method 3");
		
	}
	
	@Before 
	public void junitbeforemethod()
	{
		System.out.println("before Junit method 1");
		
	}
	@After 
	public void junitaftermethod()
	{
		System.out.println("after Junit method 1");
		
	}
	
	@BeforeClass 
	public static void junitbeforeclass()
	{
		System.out.println("before Junit class");
		
	}
	@AfterClass 
	public static void junitafterclass()
	{
		System.out.println("after Junit class");
		
	}
}
