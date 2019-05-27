package com.framework.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObjects extends BasePage {
	
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement headcount; // Only use within class 
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProduct;
	
	@FindBy(xpath="//div/ul/li[2]//*[text()='Dresses']")
	private WebElement dressesTab;
	
	@FindBy(xpath="//span//preceding::a[last()-28]")
	private WebElement smallSize;
	
	@FindBy(xpath="//span//preceding::a[last()-29]")
	private WebElement mediumSize;
	
	@FindBy(xpath="//span//preceding::a[last()-30]")
	private WebElement largeSize;
	
	@FindBy(xpath="//span//preceding::a[last()-34]")
	private WebElement clickProduct;	
	
	@FindBy(xpath=("//button[@type='submit'][@name='Submit']"))
	private WebElement addToCart;
	
	@FindBy(xpath="//i[@class='icon-ok']")
	private WebElement cartAddedSuccess;
	
	
public DressesPageObjects()
{
	PageFactory.initElements(driver, this); // Page Factory It is used to identifies and Initialize WebElement 
	// initElemnt => Elements intialitz to driver // this => Currnet class elements call 
}

public int getProductCount()
{
	return lstProduct.size();
}
public int getProductCountFromHeader()
{
	/*String msg=headcount.getText();
	String[] arr=msg.split("");
	String text=arr[2];
	int value=Integer.parseInt(text);
	return value;
	*/
	return Integer.parseInt(headcount.getText().split("")[2]); // Wraper class 
}

public boolean getSmallSize()
{
	dressesTab.click();
	boolean str=smallSize.isDisplayed(); // Element check 
	return str;
}

public boolean getMediumSize()
{
	dressesTab.click();
	boolean str=mediumSize.isDisplayed();
	return str;
}
public boolean getLargeSize()
{
	dressesTab.click();
	boolean str=largeSize.isDisplayed();
	return str;
}

public void clickFirstProduct()
{
	clickProduct.click();
	addToCart.click();
}


public String getProductAddedcart()
{
	return cartAddedSuccess.getText();
}

}
