package org.test.sep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestCustRecords {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
	      driver.get("http://localhost:8090/SEP/customer_records.html");
	      Thread.sleep(2000);
	      driver.findElement(By.id("cname")).sendKeys("supri");
	     Thread.sleep(2000);
	      driver.findElement(By.id("number")).sendKeys("34456689");
	      Thread.sleep(2000);
	      driver.findElement(By.id("add")).sendKeys("edara");
	      Thread.sleep(2000);
	      driver.findElement(By.id("date")).sendKeys("10/02/1986");
	      Thread.sleep(2000);
	      driver.findElement(By.id("event")).sendKeys("marrige");
	      Thread.sleep(2000);
	      driver.findElement(By.id("bud")).sendKeys("455666");
	      Thread.sleep(2000);
	      driver.findElement(By.id("email")).sendKeys("supi@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.id("fj")).click();
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	      driver.close();
	}

}
