package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import POM.Guru99Xpaths;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.guru99.com/");
		 driver.manage().window().maximize();
		 Guru99Xpaths gs =new Guru99Xpaths();
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://backoffice-obr4-stg.internal.ladbrokes.com/admin");
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Administrator");
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1ncharge");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      driver.findElement(By.xpath("//*[@id=\"vclickMenu\"]/li[2]/span")).click();
	      driver.findElement(By.xpath("//*[@href='/admin?action=ADMIN::EV_SEL::GoEvSel']")).click();
	      //driver.findElement(By.xpath("(//td//option[@value='21'])[1]")).click();
	       driver.switchTo().defaultContent();
	       String el=driver.getTitle();
	       System.out.println(el);
	       driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	       //driver.switchTo().frame(0);
	      //Select drcat=new Select(driver.findElement(By.name("CategoryId")));
	       /Select drcat=new Select(driver.findElement(By.xpath("//select[@id='CategoryId']/option[text()='Horse Racing']")));
	      drcat.selectByVisibleText("FB_CATEGORY");*/
	       //driver.findElement(By.xpath("(//select//option[@value='156'])[1]")).click();
	       // Select list1=new Select(driver.findElement(By.xpath("//select[@id='CategoryId']"))); 
	        //list1.selectByVisibleText("Horse Racing");
	       //js.executeScript(document.querySelector(\"[name='CategoryId']\").value = '""), args)
	       //JavascriptExecutor js = (JavascriptExecutor)driver;
	        //driver.switchTo().frame("MainArea");
	       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        //WebElement el1 = driver.findElement(By.xpath("//select[@id='CategoryId']"));
	        //Select drop = new Select(el1);
	        //drop.selectByIndex(0);
	        // driver.switchTo().frame("MainArea");
	        // Thread.sleep(10000);
	         
	        // WebElement Java=driver.findElement(By.xpath("//select[@id='CategoryId']/option[text()='HR_CATEGORY']"));
	        // JavascriptExecutor js = (JavascriptExecutor)driver;
	         // js.executeScript("arguments[0].click();", Java);*/
	         
	     
	     
	     
	
	       
	       
	     
	      
	     
	      
	}

}
