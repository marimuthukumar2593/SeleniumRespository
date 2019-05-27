package com.framework.classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	
	@FindBy(xpath="//input[@value='Enter your e-mail']")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(name="submitNewsletter")
	private WebElement btnSubmitNewsLetter;

	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement txtSubscription;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenTab;
	
	@FindBy(xpath="//div/ul/li[2]//*[text()='Dresses']")
	private WebElement dressesTab;
	
	@FindBy(xpath="//li[3]//a[@title='T-shirts']")
	private WebElement tshirtTab;
	
	public HomePageObjects()
	{
        PageFactory.initElements(driver, this);
	}
        
    public void setNewsLetter(String email){
		setText(txtBoxNewsLetter, email);
		btnSubmitNewsLetter.click();
	}

    public String getTxtNewsletterMessage()
	{
		return txtSubscription.getText();
	}

    public String getTxtWomenTab()
    {
    	return womenTab.getText();
    }
    
    public String getTxtWomentitle()
    {
    	womenTab.click();
    	String val=driver.getTitle();
    	return val;
    }
    
    public String getDressesTab()
    {
        return dressesTab.getText();	
    }
    public String getTxtDresstitle()
    {
    	dressesTab.click();
    	String val=driver.getTitle();
    	return val;
    }
        
    public String getTshirttab()
    {
    	String st=tshirtTab.getText();
    	return st;
    }
    
}

	
