package com.syntax.seleniumText__Asel__Sunday__2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPageTest extends CommonMethods{

	public WebElement username=driver.findElement(By.id("txtUsername"));
	
	public WebElement password=driver.findElement(By.id("txtPassword"));
	
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	
}