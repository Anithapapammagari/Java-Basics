package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaProgram {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kesav\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://tutorialsninja.com/demo/");
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			
			///WebElement myAccountbutton=driver.findElement(By.linkText("//span[@class='hidden-xs hidden-sm hidden-md']"));
			///myAccountbutton.click();
			
			///WebElement myAccountbutton=driver.findElement(By.linkText("//span[@class='hidden-xs hidden-sm hidden-md']"));
			///myAccountbutton.click();
			Thread.sleep(2000);
			WebElement firstNamefield= driver.findElement(By.xpath("//input[@id='input-firstname']"));
			firstNamefield.sendKeys("Anitha");
            Thread.sleep(2000);
			WebElement lastNamefield= driver.findElement(By.xpath("//input[@id='input-lastname']"));
			lastNamefield.sendKeys("Papa");
			Thread.sleep(2000);
            WebElement emailField= driver.findElement(By.xpath("//input[@id='input-email']"));
            emailField.sendKeys("anitha@gmail.com");
			Thread.sleep(2000);

            WebElement telephone= driver.findElement(By.xpath("//input[@id='input-telephone']"));
            telephone.sendKeys("5523581040");
            Thread.sleep(2000);
            WebElement password= driver.findElement(By.xpath("//input[@id='input-password']"));
            password.sendKeys("anitha123");
            Thread.sleep(2000);
            WebElement passwordconfirm= driver.findElement(By.id("input-confirm"));
            passwordconfirm.sendKeys("anitha123");
            
			WebElement continuebutton= driver.findElement(By.xpath("//input[@value='Continue']"));
			continuebutton.click();
			Thread.sleep(2000);
			driver.close();
			
	}

}
