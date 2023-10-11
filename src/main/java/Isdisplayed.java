import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isdisplayed {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		ElementUtil eu=new ElementUtil(driver);
		By Email=By.id("input-email");
		//Boolean flag=eu.isDisplayed(Email);
		//System.out.println(flag);
	//	if(eu.isDisplayed(Email))
	//	{
	//		eu.dosendKeys(Email, "naveen@gmail.com");
	//	}
		Boolean enable=eu.isEnabled(Email);
		System.out.println(enable);
	}

}
