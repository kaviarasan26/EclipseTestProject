package trail.com;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		String s = System.getProperty("user.div");
//		System.out.println(s);
		
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		Thread.sleep(2000);
		//to get full page 
		File source = driver.getScreenshotAs(OutputType.FILE);
		File Loc=new File("./Screenshot/img1.png");
		FileHandler.copy(source, Loc);
		//to get partical element
		WebElement elem= driver.findElement(By.xpath("(//li[@id='text-2'])[1]"));
		File elesource=elem.getScreenshotAs(OutputType.FILE);
		File Eleloc=new File("./Screenshot/img2.png"); 
		FileHandler.copy(elesource, Eleloc);
		
		//WebElement findElement = driver.findElement(By.xpath("(//img[@alt='logo Testleaf'])[1]"));
		
		
		
	}

}
