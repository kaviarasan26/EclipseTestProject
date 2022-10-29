package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Eclipse\\eclipse projects\\SeleniumProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='wp-categories-link maxheight'])[14]")).click();
		Actions act=new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
		System.out.println("Drag and Drop");
		System.out.println(target.getText());
		
		driver.navigate().back();
		driver.findElement(By.xpath("(//*[@class='wp-categories-link maxheight'])[13]")).click();
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).build().perform();
		act.moveByOffset(519, 103).perform();
		act.release().build().perform();
		System.out.println("***************");
		System.out.println("Draggable");
		
		
	}

}
