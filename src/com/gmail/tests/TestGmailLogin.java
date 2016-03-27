package com.gmail.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmail.code.GmailLogin;

public class TestGmailLogin {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void getUrl(){
		driver = new FirefoxDriver();
		driver.get("http://gmail.com/");
	}
	
	@Test
	public void login(){
		GmailLogin.Email(driver).sendKeys("abc@gmail.com");
		GmailLogin.NextButton(driver).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		GmailLogin.Password(driver).sendKeys("anything");
		GmailLogin.SignInButton(driver).click();
		
		GmailLogin.SelectEmail(driver).click();
		
		GmailLogin.Compose(driver).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		GmailLogin.To(driver).sendKeys("xyz@gmail.com");
		GmailLogin.Subject(driver).sendKeys("What's Up!");
		GmailLogin.Send(driver).click();
		
		Actions builder = new Actions(driver);
		
		Action builderOfActions = builder.dragAndDrop(GmailLogin.SelectEmail(driver), GmailLogin.DropEmail(driver)).build();
		
		builderOfActions.perform();
	}

}
