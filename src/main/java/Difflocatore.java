import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Difflocatore {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		ElementUtil eu=new ElementUtil(driver);
		//Id
		//2.Name locator
		//By Email=By.name("email");
		//By pswd=By.name("password");
		
	
		//eu.dosendKeys(Email, "naveen@gmail.com");
		//eu.dosendKeys(pswd, "Test@123");
		///3.classname
		//By Email=By.className("form-control");
		//eu.dosendKeys(Email, "naveen@gmail.com");
		
		//4.xpath
		//By Email=By.xpath("//*[@id=\"input-email\"]");
		//By pass=By.xpath("//*[@id=\"input-password\"]");
		//By sub=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		//eu.dosendKeys(Email, "naveen@gmail.com");
		//eu.dosendKeys(pass, "Test@123");
		//eu.doclick(sub);
		
		//5.Cssselector
		//By Email=By.cssSelector("#input-email");
		//By pass=By.cssSelector("#input-password");
		//eu.dosendKeys(Email, "naveen@gmail.com");
		//eu.dosendKeys(pass, "Test@123");
		
		//6.Linktest--only for links
		//By reg=By.linkText("Register");
		//eu.doclick(reg);
		
		//7.Partil linktext--only for links
		//By fpass=By.partialLinkText("Forgotten");
		//eu.doclick(fpass);
		
		//8.tagname
		By text=By.tagName("h2");
		System.out.println(eu.getText(text));
		
	
	}

}
