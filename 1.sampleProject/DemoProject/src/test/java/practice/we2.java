package practice;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class we2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo21.webplat.in/auth/login");
		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("4444466666");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"fullName\"]")).sendKeys("4444466666");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[text()=' Sign In ']")).click();
	
    	Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"newsModal\"]/div/div/div[1]/button")).click();
    	Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Services']")).click();
    	Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"sidemenu-Tab\"]/div[2]/div/div[2]/div[2]/a[1]")).click();
		
    	Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id=\"Mobile no.\"]")).sendKeys("8149997894");
    	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"amount\"]")).sendKeys("9");
    	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"tPin\"]")).sendKeys("1234");
    	Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary w-50 me-2 ng-tns-c103-24\"]")).click();

		
    	Thread.sleep(2000);

		//dropdown
    	
    	Select select= new Select(driver.findElement(By.xpath("//div[@class=\"w-100 p-dropdown p-component p-dropdown-open\"]")));
    	
    	System.out.println(select.getOptions());
    	
    	

	}
	
	
	
}
