package Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test01");
 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("fbaccnt");
 driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
 driver.findElement(By.id("password_step_input")).sendKeys("Test@1234");
 driver.findElement(By.xpath("//select[@name='birthday_day']/option[1]")).click();
 driver.findElement(By.xpath("//select[@name='birthday_month']/option[6]")).click();
 driver.findElement(By.xpath("//select[@name='birthday_year']/option[37]")).click();
 driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();
 driver.findElement(By.name("websubmit")).click();

 
  
  
 
	}

}

