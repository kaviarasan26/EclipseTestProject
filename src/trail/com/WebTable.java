package trail.com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor jsp=(JavascriptExecutor)driver;
jsp.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("(//table[@id='product'])[2]")));
WebElement table = driver.findElement(By.xpath("(//table[@id='product'])[2]"));

System.out.println("*****Get the number of rows******");
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println(rows.size());

System.out.println("*****Get the number of columns******");

List<WebElement> Colm = table.findElements(By.tagName("th"));
System.out.println(Colm.size());

System.out.println("*****Get all the data from a row******");
 for (int i = 0; i< rows.size(); i++) {
	System.out.println(rows.get(i).getText()); 
	//int size = rows.size();
}
 System.out.println("*****Get the data from a row and sum******");
 int count, sum=0;
 List<WebElement> Rowdata = table.findElements(By.xpath("(//table[@id='product'])[2]//tbody//td[4]"));
 for (WebElement webElement : Rowdata) {
	System.out.println(webElement.getText());
	count=Integer.parseInt(webElement.getText());//convert string to integer
	sum=sum+count;
}

 System.out.println("sum:" + sum);
System.out.println("*****Get all the data from a columns******");
 for (int j = 0; j <Colm.size(); j++) {
	System.out.println(Colm.get(j).getText()); 
	
}

	
	}
}