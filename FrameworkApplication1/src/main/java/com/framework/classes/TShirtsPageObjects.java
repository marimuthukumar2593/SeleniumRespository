package com.framework.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TShirtsPageObjects extends BasePage {
	
	/*@FindBy(xpath="//li[3]//a[@title='T-shirts']")
	private WebElement Tshirts;*/
	
	@FindBy(xpath="//li[3]//a[@title='T-shirts']")
	private WebElement tshirtTab;

	
	public String getTshirtsTab()
	{
		return tshirtTab.getText();
	}
	
	public String getTxtTshirttitle()
    {
		tshirtTab.click();
    	String val=driver.getTitle();
    	return val;
    }
    
	}
