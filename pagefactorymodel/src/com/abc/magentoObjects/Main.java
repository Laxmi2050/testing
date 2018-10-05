package com.abc.magentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {
	WebDriver driver;
	@FindBy(linkText="Log Out")
	WebElement logout;
	
	public Main(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	public void clickOnLogout()
	{
		logout.click();
	}

}
