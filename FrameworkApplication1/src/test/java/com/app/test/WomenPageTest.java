package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.classes.HomePageObjects;



public class WomenPageTest {
	HomePageObjects hp=new HomePageObjects();

	//Verify Women tab is displayed on Home Page
	@Test(priority=0)
	public void verifyWomenTab()
	{
		String tabName=hp.getTxtWomenTab();
		//System.out.println(tabName);
		Assert.assertTrue(tabName.contains("WOMEN"), "Women Tab is not present on home page");
	}
	//Verifying the page navigated corresponding women page
	@Test
	public void pageNavigatedToWomenTab()
	{
		String str=hp.getTxtWomentitle();
		Assert.assertTrue(hp.getTxtWomentitle().contains("Women"), "The page navigated wrongly");
	}
	
}
