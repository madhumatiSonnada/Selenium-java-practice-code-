import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
		String title=waitfortitlecontains(10,"Login");
		System.out.println(title);
		String Acttitle=waitfortitle(10,"Account Login");
		System.out.println(Acttitle);

	}

	public static String waitfortitlecontains(int timeout,String titleFraction)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
				if(wait.until(ExpectedConditions.titleContains(titleFraction)))
				{
					return driver.getTitle();
				}
		return null;
	}
	public static String waitfortitle(int timeout,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(title)))
		{
			return driver.getTitle();
		}
		return null;
	}
}
