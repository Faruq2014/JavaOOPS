package com.Interface_Inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MuradDriveer {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver mtDriver= new ChromeDriver();
		
	}

}
