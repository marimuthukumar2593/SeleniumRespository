package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.classes.DressesPageObjects;
import com.framework.classes.HomePageObjects;



public class DressesPageTest {	// 
	HomePageObjects hp; // First open the initial page to contains Women, dresses and T Shirst (Home page )
	DressesPageObjects dpo; //  Dress object Create one object 

public DressesPageTest()  // Constructor (First default call only call this class so this not contain main method )
{
	hp=new HomePageObjects();	// create objects 
	dpo=new DressesPageObjects();
}
@Test() // This line TestScript case running place (Test Cases)
public void verifyProductCount()
{
Assert.assertTrue(dpo.getProductCount()==dpo.getProductCountFromHeader(), "Count Mismatched"); //Assert using for success or failure
                 //Dress page Check Product count 5 Products // => Boolean True success or string message print s                            
}

	//Verify Dresses tab is displayed on Home Page

@Test(enabled=true, priority=1) // enabled true means execute and Prioury order based Test case execute 
	public void verifyDressesTab() // CHECK DRESS TAB AVAILABLE OR NOT 
	{
		String dresstabname=hp.getDressesTab(); // Dress tab check home page 
		Assert.assertTrue(dresstabname.contains("DRESSES"), "Dress tab is not present on home page"); // contain paraticular value fine 
	}

	//Verifying the page navigated corresponding Dresses page
	@Test
	public void pageNavigatedToDressPage()
	{
		String title=hp.getTxtDresstitle();
		//System.out.println(title);
		Assert.assertTrue(title.contains("Dress"), "The page navigated wrongly");
		}
	
	//Verifying Small size is displayed
	@Test
	public void verifySmallSize()
	{
	Assert.assertTrue(dpo.getSmallSize()); // Assert TRUE success 
	}
	
	//Verifying Medium size is displayed

	@Test
	public void verifyMediumSize()
	{
	Assert.assertTrue(dpo.getMediumSize());
	}
	
	//Verifying large size is displayed
	@Test
	public void verifyLargeSize()
	{
	Assert.assertTrue(dpo.getLargeSize());
	}
	//Add first product and verify its added to cart
	@Test
	public void verifyProductAddedIntoCart()
	{
		String str=dpo.getProductAddedcart();
				System.out.println(str);
		Assert.assertTrue(dpo.getProductAddedcart().contains("success"), "");
	}
}	

