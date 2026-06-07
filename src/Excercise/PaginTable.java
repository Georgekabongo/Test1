package Excercise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PaginTable {
	
	@Test
	public void Execute() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabongo QA Engineer\\Desktop\\devtools\\chromedriver-win64\\chromedriver.exe");
	       
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();

       // WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/multi_col_sort.html");

		driver.findElement(By.xpath("//span[text()='First name']")).click();
        //this  webelement will be a list it will store the all data in colunm and will pass it in the arrayList
		List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> Arr = new ArrayList<>();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		for (WebElement e : elements)
		{
		    Arr.add(e.getText());
		}

		
		String nextButton = driver.findElement(By.xpath("//button[@data-dt-idx='last']"))
		                          .getAttribute("class");

		while (!nextButton.contains("disabled"))
		{
		    //driver.findElement(By.cssSelector("//button[@data-dt-idx='last']")).click();
			// Use the wait object to wait for a specific condition
			// Now you can interact with the element confidently
			//element.click();
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-dt-idx='last']")));
		  
		           
		    element.click();
		    elements = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		    for (WebElement e : elements)
		    {
		        Arr.add(e.getText());
		    }

		    nextButton = driver.findElement(By.xpath("//button[@data-dt-idx='last']"))
		                       .getAttribute("class");
		}

		for (String a : Arr)
		{
		    System.out.println(a);
		}
        
	}

}
