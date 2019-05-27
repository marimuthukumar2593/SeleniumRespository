package com.app.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.classes.HomePageObjects;


public class HomePageTest {
    
    HomePageObjects hp;

    int random=new Random().nextInt(500000);
    String email="ganesh"+random+"@gmail.com";
		public HomePageTest()
		{
			hp=new HomePageObjects();
		}

		//Verify Subscription message is displayed after entering valid e-mail in Newsletter
		@Test
		public void verifySubscription()
		{
		hp.setNewsLetter(email);
		String msg=hp.getTxtNewsletterMessage();
		Assert.assertTrue(msg.contains("successfully"), "Subscription message not displayed");
		}

}