package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
public class Testngone {

	
	@Test
	public void Testng1()
	{
		System.out.println("Testng method 1");
	}
	
	@Test
	public void Testng2()
	{
		System.out.println("Testng method 2");
	}
	
	
	@BeforeMethod
	public void BeforeMet()
	{
		System.out.println("Testng before method");
	}
	@AfterClass
	public void Afterclas()
	{
		System.out.println("Testng after class");
	}
	
	@AfterMethod
	public void afterMet()
	{
		System.out.println("Testng after method");
	}
	@BeforeClass
	public void Beforeclas()
	{
		System.out.println("Testng before class");
	}
	
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("Testng before suite");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("Testng after suite");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Testng after test");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Testng before test");
	}
	
	
	
}
