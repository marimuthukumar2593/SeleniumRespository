package com.framework.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class BasePage  {
	
	public static WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) { // Inital case object null so object initialized not mention which driver 
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Chrome_Drivers\\74_chromedriver\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	
	}
	public boolean elementFound(WebElement element) { // Web elemment found in webpage
		boolean res = false; // res is boolean value return 
		try {
			res = element.isDisplayed(); // CHeck wherather elemnte displayed in the web page 
		} catch (Exception e) { // Execption handling (e show the the exception error message
			e.printStackTrace(); // Console prints 
		}
		return res;
	}

	public void setText(WebElement element, String name) { // Method name 
		if (name != null) { // Not equla to null (element not in empty 
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}

	public String getTxtAttribute(WebElement element) { // Get Attribute value 
		return element.getAttribute("value");
	}

	public String selectFromDropDown(WebElement element, String option) { // Drop down function 
		Select obj = new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
	}

	public boolean isElementVisible(WebElement element) { // Element visibility functions 
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getTitlte() {
		return driver.getTitle();
	}	
	
	public void quitDriver() {
		driver.quit();
	}
}
