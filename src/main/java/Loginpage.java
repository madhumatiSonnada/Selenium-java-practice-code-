import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{

	public static void main(String[] args)
	{
		BrowserUtil br=new BrowserUtil();
	WebDriver driver=br.launchBrowser("Chrome");
	br.getUrl("http://opencart.antropy.co.uk/index.php?route=account/login");
	String title=br.gettitle();
	System.out.println(title);
	System.out.println(br.getpageUrl());
	
	By mail=By.id("input-email");
	By ps=By.id("input-password");
	ElementUtil el=new ElementUtil(driver);
	el.dosendKeys(mail, "naveen@gmail.com");
	el.dosendKeys(ps, "Test@123");
	//br.quit();
	
		

	}

}
