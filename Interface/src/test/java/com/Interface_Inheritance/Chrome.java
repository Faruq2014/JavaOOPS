package com.Interface_Inheritance;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome  extends ChromeDriver implements WebDriver{
//Chrome class is created by us and it is extending ChromeDriver class created by 
	//google or..... and implementing WebDriver interface at a time.
	 static WebDriver driver = null;
	public static void main(String[] args) {
		// this is ChromeDriver class implementation written by google.......
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.getCurrentUrl();
		driver.getTitle();
		System.out.println("the url is  "+driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		// own WebDriver interface implementation by chrome class written by us.
		Chrome chrome= new Chrome();
		chrome.getTitle();
		chrome.quit();
	}

	@Override
	public void get(String url) {
      
	}

	@Override
	public String getCurrentUrl() {
	
		return null ;
	}

	@Override
	public String getTitle() {
		System.out.println("the title is implementing WD method");
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		driver.quit();
		System.out.println("quiting method is not working , because i did not write the "
				+ "argument how to quite the driver.");
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
