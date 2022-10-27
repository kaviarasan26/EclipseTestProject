package trail.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone",Keys.ENTER);
		int size = driver.findElements(By.xpath("//div[@class='rR']")).size();
		System.out.println("***************Number of count:" +size);
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement webElement : count) {
			System.out.println(webElement.getText());
		}
		for (int i = 0; i < count.size(); i++) {
			if(count.get(i).getText().equals("APPLE iPhone 13 Pro (Silver, 1 TB)")) {
				System.out.println("*************************");
				System.out.println(count.get(i).getText());
				count.get(i).click();
				break;
			}			
		}
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!parent.equals(string))
			driver.switchTo().window(string);
			System.out.println("*********Title***************");
			System.out.println(driver.getTitle());
		}

		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Postcode = driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
		Postcode.sendKeys("600040");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//Span[text()='Check']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		jsp.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//div[@class='_2-uG6-']")));
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc=new File("./Screenshot/Order.png");
		FileHandler.copy(source, Loc);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO'][2]")).click();
		driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
		Thread.sleep(2000);
		File source2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc2=new File("./Screenshot/Remove.png");
		FileHandler.copy(source2, Loc2);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		Thread.sleep(2000);
		File source3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc3=new File("./Screenshot/Login.png");
		FileHandler.copy(source3, Loc3);
	}

}

