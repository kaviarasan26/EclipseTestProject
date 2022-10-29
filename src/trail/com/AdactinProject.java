package trail.com;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("kaviarasan21");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
		WebElement loca = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(loca);
		s.selectByVisibleText("London");
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));	
		Select ho=new Select(hotel);
		ho.selectByIndex(3);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select room1=new Select(room);
		room1.selectByValue("Deluxe");
		WebElement num = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select number = new Select(num);
		number.selectByIndex(4);
		driver.findElement(By.cssSelector("input[name='datepick_in']")).sendKeys("26/07/2022");
		driver.findElement(By.cssSelector("input[name='datepick_out']")).sendKeys("28/07/2022");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select adultroom = new Select(adult);
		adultroom.selectByIndex(3);
		WebElement child = driver.findElement(By.id("child_room"));
		Select childroom = new Select(child);
		childroom.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kavi");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Arasan");
		driver.findElement(By.id("address")).sendKeys("Anna Nagar");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("12345678910123456");
		WebElement card = driver.findElement(By.id("cc_type"));
		Select type = new Select(card);
		type.selectByIndex(2);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(month);
		m.selectByIndex(2);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(year);
		y.selectByIndex(8);
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("321");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(6000);
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		jsp.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.id("my_itinerary")));
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc=new File("./Screenshot/booked.png");
		FileHandler.copy(source, Loc);
		driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		File source4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc4=new File("./Screenshot/List.png");
		FileHandler.copy(source4, Loc4);
		driver.findElement(By.name("cancelall")).click();
		driver.switchTo().alert();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc1=new File("./Screenshot/cancel.png");
		FileHandler.copy(source1, Loc1);
		Thread.sleep(5000);
		driver.findElement(By.name("logout")).click();
		File source2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Loc2=new File("./Screenshot/Logout.png");
		FileHandler.copy(source2, Loc2);;
	}

}
