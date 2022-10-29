package trail.com;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rolex watch");
			Thread.sleep(3000);
			 List<WebElement> Autosugg = driver.findElements(By.xpath("//div[@role='button']"));
			 
			 for (int i = 0; i < Autosugg.size(); i++) {	
				 System.out.println(Autosugg.get(i).getText());
			 }
			 for (int i = 0; i < Autosugg.size(); i++) {	
				 System.out.println(Autosugg.get(i).getText()); 
			 
			if (Autosugg.get(i).getText().equalsIgnoreCase("rolex watch")) {
				 
				Autosugg.get(i).click();
				break;
			}
			 }
			 WebElement amount = driver.findElement(By.xpath("//span[contains(text(),'Mechanical Movement Watches Men')]//following::span[7]"));
			 System.out.println(amount.getText()); 
			 WebElement amt = driver.findElement(By.xpath("//span[contains(text(),'Mechanical Movement Watches Men')]//following::span[7]//following::span[3]"));
			  System.out.println("Product Amount:"+amt.getText());
			  Thread.sleep(2000);
		
				System.out.println(amount.getText());
			 WebElement Product = driver.findElement(By.xpath("//span[contains(text(),'Mechanical Movement Watches Men')]"));
			System.out.println("Product Name:"+Product.getText()); 
			 Product.click();
			 Thread.sleep(2000);
			 String parent = driver.getWindowHandle();
			 Set<String> windowHandles = driver.getWindowHandles();
				for (String string : windowHandles) {
					if(!parent.equals(string))
					driver.switchTo().window(string);
					System.out.println("*********Title***************");
					System.out.println(driver.getTitle());
				}
			 
			 
			 List<WebElement> list = driver.findElements(By.id("centerCol"));
			 System.out.println("****Same product or Not****");
			 for (int i = 0; i < list.size(); i++) {
				
				//System.out.println(list.get(i).getText());//it will give about details
				if(list.get(i).getText().contains("Mechanical Movement Watches Men Luxury Brand Automatic Luxury Watch")) {
					System.out.println("Same Product");
				}else {
					System.out.println("Product is not same");
				}
				System.out.println("****Same Amount or Not****");
				if(list.get(i).getText().contains("6,999")) {
					
					System.out.println("Amount is Same");
					}else {
						System.out.println("Amount is not same");
					}
			}
			 
			 WebElement display = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
			System.out.println("******Stock******");
			 System.out.println( display.getText());
			 if(display.isDisplayed()) {
				 System.out.println("Stock is available");
			 }else {
				System.out.println("Stock is not available");
			}
			 
			 WebElement date = driver.findElement(By.xpath("(//span[@class='a-text-bold'])[3]"));
			 System.out.println("******Delivery Date******");
			 System.out.println(date.getText());
			 
			WebElement Quantity = driver.findElement(By.xpath("//select[@id='quantity']"));
			 
			 Select q=new Select(Quantity);
			 q.selectByValue("3");
			 Thread.sleep(2000); 
			 if(Quantity.getText().contains("3")) {
				 System.out.println("Quantity is added");
			 }
					 
			 driver.findElement(By.id("add-to-cart-button")).click();
			 
			 
			 
			 
			 
			 
			 
			 
			 
}}
