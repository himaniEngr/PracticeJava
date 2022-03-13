import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPageSize {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://www.google.com";
		driver.get(url);
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(640,485);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		driver.close();
	}

}
