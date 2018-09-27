package tests;


import org.testng.annotations.Test;

public class HomePage extends TestBase{
	
	pages.HomePage homeObject;
	
	@Test(priority=1, alwaysRun=true)
	public void UserCanSearchFlights() 
	
	{	
		homeObject = new pages.HomePage(driver);
		homeObject.searchflights();
	}

}
