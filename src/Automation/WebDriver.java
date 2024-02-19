package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");  
	ChromeDriver driver=new ChromeDriver();   
      driver.navigate().to("http://www.javatpoint.com/");
      driver.manage().window().maximize();
      
      //Scroll down the webpage by 5000 pexel
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("scrollBy(1, 20000)");
      
      driver.quit();
	

	}

}
