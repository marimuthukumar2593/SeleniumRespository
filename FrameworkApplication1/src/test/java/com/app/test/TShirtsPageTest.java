package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.classes.HomePageObjects;
import com.framework.classes.TShirtsPageObjects;


public class TShirtsPageTest {

	HomePageObjects hp;
	TShirtsPageObjects tpo;
	
	public TShirtsPageTest()
	{
		hp=new HomePageObjects();
		tpo=new TShirtsPageObjects();
	}
	
	//Verify T-shirt tab is displayed on Home Page
		@Test()
		public void verifyTshirtsTab() {
		String tshirttabname=hp.getTshirttab();
		System.out.println("value to be:"+tshirttabname);
			Assert.assertTrue(tshirttabname.contains("T-SHIRTS"),"T-Shirts tab is not present on home page");
		}
		//Verifying the page navigated corresponding Tshirts page
		@Test
		public void pageNavigatedToTshirtPage()
		{
			String title=tpo.getTxtTshirttitle();
			System.out.println(title);
			Assert.assertTrue(title.contains("T-SHIRTS"), "The page navigated wrongly");
			}
		
}


