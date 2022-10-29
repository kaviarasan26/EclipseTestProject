package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html#multiple-selection");
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.xpath("(//select[@name='skills'])[1]"));
	Select mom=new Select(multi);
if(mom.isMultiple()) {
	mom.selectByValue("Angular");
//	mom.selectByValue("css");
//		mom.selectByIndex(7);
	}
	}
}

