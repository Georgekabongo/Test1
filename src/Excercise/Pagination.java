package Excercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination {
	
	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kabongo QA Engineer\\Desktop\\devtools\\chromedriver-win64\\chromedriver.exe");
        String productName = "banana";
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean found = false;
		 
		 while(!found)
		 {
			 
	
		for (int i=0; i<rows.size(); i++)
		{
			//WebElement elementname = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//tbody/tr/td[1]")));
			//elementname.click();
		    Thread.sleep(2000);
			String name=rows.get(i).findElement(By.xpath("//tbody/tr/td[1]")).getText();
			
			if (name.equals(productName)) {

                String price = rows.get(i).findElement(By.xpath("//tbody/tr/td[2]")).getText();

                System.out.println("Price of " + productName + " is: " + price);

                found = true; 
                break;
			
		   }
		}
		if (!found) {

            WebElement nextButton = driver.findElement(By.cssSelector("[aria-label='Next']"));

            if (nextButton.isEnabled()) {

                nextButton.click();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {

                System.out.println("Product not found");
                break;
            }
        }
    }

   // driver.quit();
	}

	}
  

