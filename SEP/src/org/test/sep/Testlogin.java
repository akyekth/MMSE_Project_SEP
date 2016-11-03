package org.test.sep;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testlogin  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
	      driver.get("http://localhost:8090/SEP");
	      Thread.sleep(2000);
	      driver.findElement(By.id("usr")).sendKeys("supri");
	     Thread.sleep(2000);
	      driver.findElement(By.id("pwd")).sendKeys("dfgg");
	      
	      driver.findElement(By.id("fj")).click();
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	      driver.close();
	}


}
