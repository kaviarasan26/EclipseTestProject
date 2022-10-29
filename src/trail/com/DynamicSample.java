package trail.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium class\\\\Webdriver\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");

		// SELF
		System.out.println("-----------SELF------------");
		String text = driver.findElement(By.xpath("//a[text()='S&P BSE 500']/self::a")).getText();
		System.out.println(text);

		// PARENT
		System.out.println("------------PARENT-----------");
		text = driver.findElement(By.xpath("//a[text()='S&P BSE 500']/parent::li")).getText();
		System.out.println(text);

		// CHILD
		System.out.println("----------CHILD-------------");
		List<WebElement> share = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/child::li"));
		
		System.out.println("Number Of Child Elements:" + share.size());
		for (int i = 0; i < share.size(); i++) {
			System.out.println(share.get(i).getText());
		}

		// ANCESTOR
		System.out.println("-----------ANCESTOR1------------");
		text = driver.findElement(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul")).getText();
		System.out.println(text);

		System.out.println("-----------ANCESTOR2------------");
		List<WebElement> ances = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul"));
		System.out.println(ances.size());
		for (int i = 0; i < ances.size(); i++) {
			System.out.println(ances.get(i).getText());
		}
		// DESCENDANT
		System.out.println("------------DESCENDANT 1-----------");
		List<WebElement> des = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/descendant::*"));
		System.out.println("-----------index-------");
		System.out.println(des.get(1).getText());
//		for (int i = 0; i < des.size(); i++) {
//			System.out.println(des.get(i).getText());
//		}
		System.out.println("-----------DESCENDANT 2------------");
		List<WebElement> des1 = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/descendant::*"));
		System.out.println(des1.size());

		//FOLLOWING
		System.out.println("----------FOLLOWING for each = Multiple Elements---------------");
		List<WebElement> following = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/following::ul"));
		System.out.println(following.size());
		for (WebElement web : following) {
			System.out.println(web.getText());
	}
		System.out.println("----------FOLLOWING text() = 1 Element---------------");
		text=driver.findElement(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/following::ul")).getText();
		System.out.println(text);
		
	//FOLLOWING-SIBLING
		System.out.println("--------------FOLLOWING-SIBLING for each--------------");
		 List<WebElement> followingsib = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/following-sibling::ul"));
	System.out.println(followingsib.size());
	for (WebElement Element : followingsib) {
	System.out.println(Element.getText());	
	}
	
	System.out.println("--------------FOLLOWING-SIBLING Text()--------------");
	text=driver.findElement(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/following-sibling::*")).getText();
	System.out.println(text);
	//PRECEDING
	
	System.out.println("-------------PRECEDING TEXT()---------------");
	text=driver.findElement(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/preceding::ul")).getText();
	System.out.println(text);
	
	System.out.println("-----------PRECEDING FOR EACH----------");
	List<WebElement> preced = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/preceding::ul"));
	System.out.println(preced.size());
	for (int i=0;i<preced.size();i++) {
	System.out.println(preced.get(i).getText());
	}
	
	System.out.println("-------------PRECEDING-SIBLING TEXT()---------------");
	text=driver.findElement(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/preceding-sibling::ul")).getText();
	System.out.println(text);
	
	
	System.out.println("-----------PRECEDING-SIBLING FOR EACH----------");
	List<WebElement> presib = driver.findElements(By.xpath("//a[text()='S&P BSE 500']/ancestor::ul/preceding-sibling::ul"));
	System.out.println(presib.size());
	for (WebElement webElement : presib) {
		System.out.println(webElement.getText());
	}

	}
}
