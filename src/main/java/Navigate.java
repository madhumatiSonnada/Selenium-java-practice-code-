import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//google
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());//amazon
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		driver.navigate().forward();
		System.out.println(driver.getTitle());//amazon
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		driver.navigate().refresh();
		driver.close();
		

	}

}
