package org.test.sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver= new FirefoxDriver();
      driver.get("http://localhost:8090/SEP");
      Thread.sleep(2000);
      driver.findElement(By.id("usr")).sendKeys("jack");
      Thread.sleep(2000);
      driver.findElement(By.id("pwd")).sendKeys("pass");
      Thread.sleep(2000);
      driver.findElement(By.id("fj")).click();
      System.out.println(driver.getTitle());
      driver.close();
	}

}
