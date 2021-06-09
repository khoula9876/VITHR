package com.ex1.seliniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Umair Ullah\\eclipse-workspace\\seliniumMaven\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.findElement(By.id("email")).sendKeys("khoula007@hotmail.com");
      driver.findElement(By.id("pass")).sendKeys("khoulai123456");
      driver.findElement(By.className("login")).click();
      driver.findElement(By.id("mount_0_0_2v")).click();
      driver.findElement(By.className("hu5pjgll lzf7d6o1 sp_ZmUDkAjkCpH sx_3130ca")).click();
      
	}
}
