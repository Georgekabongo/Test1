package Excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SortPaging {
	@Test
	public void Sorted()
	{
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabongo QA Engineer\\Desktop\\devtools\\chromedriver-win64\\chromedriver.exe");
	       
			WebDriver driver = new  ChromeDriver();
			driver.manage().window().maximize();

	       // WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

	        // Click column header to sort
	        driver.findElement(By.xpath("//th[1]")).click();

	        // Get all product names
	        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));

	        List<String> originalList = new ArrayList<String>();

	        for (WebElement e : elements) {

	            originalList.add(e.getText());
	        }
	        
	        
	       

	        // Create another list for sorting
	        List<String> sortedList = new ArrayList<String>(originalList);

	        Collections.sort(sortedList);

	        // Compare lists
	        if (originalList.equals(sortedList)) {

	            System.out.println("Table is sorted correctly");

	        } else {

	            System.out.println("Sorting failed");
	        }
	}

}
