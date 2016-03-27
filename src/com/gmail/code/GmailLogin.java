package com.gmail.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogin {
	
	private static WebElement element = null;
	
	public static WebElement Email(WebDriver driver){
		element = driver.findElement(By.id("Email"));
		return element;
	}
	
	public static WebElement NextButton(WebDriver driver){
		element = driver.findElement(By.id("next"));
		return element;
	}
	
	public static WebElement Password(WebDriver driver){
		element = driver.findElement(By.id("Passwd"));
		return element;
	}
	
	public static WebElement SignInButton(WebDriver driver){
		element = driver.findElement(By.id("signIn"));
		return element;
	}
	
	
	public static WebElement Compose(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div"));
		return element;
	}
	
	public static WebElement To(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea"));
		return element;
	}
	
	public static WebElement Subject(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input"));
		return element;
	}
	
	public static WebElement Send(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]"));
		return element;
	}
	
	public static WebElement SelectEmail(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div[7]/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[5]"));
		return element;
	}
	
	public static WebElement DropEmail(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div[2]"));
		return element;
	}
	
	

}
