package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paths {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/");
		driver.manage().window().maximize();

		WebElement txtSearch = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/form/div/div/input"));
		txtSearch.sendKeys("Wel_Come");
		
		WebElement txtSearch1 = driver.findElement(By.xpath("//input[@class='search_input nomarg']"));
		txtSearch1.sendKeys("Most welcome");
		
		WebElement linkLogin = driver.findElement(By.linkText("Login"));
		linkLogin.click();

		WebElement loginTxt = driver.findElement(By.xpath("//h2[text()='Login']"));
		System.out.println(loginTxt.getText());

		WebElement txtEmail = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		txtEmail.sendKeys("mullataufik0313@gmail.com");

		WebElement textRegister = driver.findElement(By.xpath("//p[starts-with(text(),'New')]"));
		System.out.println(textRegister.getText());

		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password' and @id='login-password']"));
		txtPassword.sendKeys("Taufik");

		WebElement checkRemember = driver.findElement(By.xpath("//input[@name='remember' or @id='login-remember']"));
		checkRemember.click();

			}

}
