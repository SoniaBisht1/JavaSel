package Seleniumproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemtocart {
	public static void main(String[] args) {
		
		
WebDriver driver =new ChromeDriver();

String[] veggies = {"Cucumber","Brocoli"};

		
		driver.manage().window().maximize();

		driver.get("https://www.google.com"); 
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products  =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String name = products.get(i).getText();
			//check whether name extracted  is present on the array or not 
			//convert array into array list for easy search
			if(name.contains("Cucumber"))
			{
				//CLICK on Add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break; 
				
			}
			
		}
		
		
		
	}

}
