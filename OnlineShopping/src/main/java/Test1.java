import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.youtube.com";
		driver.manage().window().maximize();
		driver.get(url);
//		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10000);
		List <WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement ele:links) {
			System.out.println(ele.getAttribute("href"));
		}
		driver.close();
		
	}
	
}
