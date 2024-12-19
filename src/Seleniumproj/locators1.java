package Seleniumproj;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("bssonia707@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("bssonia707@gmail.com"); 
		driver.findElement(By.id("pass")).sendKeys("Sbnsonu@27");
		driver.findElement(By.name("login")).click();
		
		

	}

}
