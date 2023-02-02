package Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/control/main");
     driver.manage().window().maximize();
     driver.findElement(By.id("username")).sendKeys("DemoCSR");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Contacts")).click();
     driver.findElement(By.linkText("Create Contact")).click();
     driver.findElement(By.id("firstNameField")).sendKeys("TestLeaf");
     driver.findElement(By.id("lastNameField")).sendKeys("bhuvana");
     driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("TestLeaf_local");
     driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bhuvana_local");
     driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
     driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("QA@gmail.com");
     driver.findElement(By.id("createContactForm_description")).sendKeys("enter desc");
     
     WebElement sel = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
     Select dd=new Select(sel); 
     dd.selectByVisibleText("New York");
     driver.findElement(By.xpath("//input[@name='submitButton'][@value='Create Contact']")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("//a[text()='Edit']")).click();
     driver.findElement(By.id("updateContactForm_description")).clear();
     driver.findElement(By.id("updateContactForm_description")).sendKeys("update desc");
     driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("enter imp note");
     driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']")).click();
     String title = driver.getTitle();
     System.out.println("Title is  "+title);
	}
	
}
