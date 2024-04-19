package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		//WebElement srcbox = driver.findElement(By.className("gLFyf"));           //locating with className
		//WebElement srcbox = driver.findElement(By.cssSelector("#APjFqb"));       //locating with CSSSelector
		//WebElement srcbox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")); //locating with xpath-using single single attribute
		//WebElement srcbox = driver.findElement(By.id("APjFqb"));                 //locating with id
		
		//locating with xpath-using single multiple attributes
		//WebElement srcbox = driver.findElement(By.xpath("//*[@id='APjFqb'][@class='gLFyf']")); 
		
		// locating with dynamic xpath - using single slash
		//WebElement srcbox = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		
		//locating with xpath - using AND 
		//WebElement srcbox = driver.findElement(By.xpath("//*[@id='APjFqb' and @class='gLFyf']"));
		
		//locating with xpath - using OR
		//WebElement srcbox = driver.findElement(By.xpath("//*[@id='APjFqb' or @class='gLFyf']"));
		
		//locating with xpath - using contains()
		//WebElement srcbox = driver.findElement(By.xpath("//*[contains(@id,'APjFqb')]"));
		
		//locating with xpath - using starts-with()
	    WebElement srcbox = driver.findElement(By.xpath("//*[starts-with(@id,'APjF')]"));
	    
	  //locating with xpath - using text() - not working
	    //WebElement srcbox = driver.findElement(By.xpath("//*[text()='Google offered in:')]")); 
		
		srcbox.sendKeys("JavaTutorial");
		srcbox.sendKeys(Keys.ENTER);

	}

}
