package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.classes.ProductDetailPageObject;

public class ProductDetailPageTest {

	ProductDetailPageObject pdp;
	public ProductDetailPageTest()
	{
		pdp=new ProductDetailPageObject();	
	}

	@Test(enabled=true)
	public void verifyTweetIsPresent()
	{	
		Assert.assertTrue(pdp.tweetDisplayOnProductPage(), "Tweeter icon not available");
	}
	@Test(enabled=true)
	public void verifyFaceBookIsPresent()
	{	
		Assert.assertTrue(pdp.faceBookDisplayOnProductPage(), "facebook icon not available");
	}
	@Test
	//	Verifying Product Description is displayed
	public void verifyDescription()
	{	
		Assert.assertTrue(pdp.getDescriptionContent().contains("Faded short sleeve"), "");
	}
}
