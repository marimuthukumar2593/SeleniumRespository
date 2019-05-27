package com.framework.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPageObject extends BasePage {
	
	@FindBy(xpath="//div/ul/li[2]//*[text()='Dresses']")
	private WebElement firstProduct;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
	private WebElement tweet;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
	private WebElement faceBook;
	
	@FindBy(xpath="//span//preceding::a[last()-34]")
	private WebElement clickProduct;
	
	@FindBy(xpath="//div[@id='short_description_content']")
	private WebElement description;
	
	public ProductDetailPageObject()
	{
        PageFactory.initElements(driver, this);
	}
	public boolean tweetDisplayOnProductPage()
	{
		clickProduct.click();
		boolean twt=tweet.isDisplayed();
		System.out.println(twt);
		return twt;
	}

	public boolean faceBookDisplayOnProductPage()
	{
		boolean fac=faceBook.isDisplayed();
		return fac;
	}

	public String getDescriptionContent()
	{
		clickProduct.click();
		String str=description.getText();
		return str;
		
	}
}
