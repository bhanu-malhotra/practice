package junit1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junittwo {

	@Test 
	public void junitmethodone2()
	{
		System.out.println("Junit method 2");
		
	}
	
	@Before 
	public void junitbeforemethod2()
	{
		System.out.println("before Junit method 2");
		
	}
	@After 
	public void junitaftermethod2()
	{
		System.out.println("after Junit method 2");
		
	}
	
	@BeforeClass 
	public void junitbeforeclass2()
	{
		System.out.println("before Junit2 class");
		
	}
	@AfterClass 
	public void junitafterclass2()
	{
		System.out.println("after Junit2 class");
		
	}
}
