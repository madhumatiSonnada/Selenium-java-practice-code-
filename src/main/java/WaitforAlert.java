import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforAlert {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//	Alert al=wait.until(ExpectedConditions.alertIsPresent());
		//System.out.println(al.getText());
		//al.accept();
		AcceptAlert(10);
	}

	public static Alert waitforAlertPresent(int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static void AcceptAlert(int timeout)
	{
		waitforAlertPresent(timeout).accept();
	}
	public static void DismissAlert(int timeout)
	{
		waitforAlertPresent(timeout).dismiss();
	}
	public static String getAlerttext(int timeout)
	{
		return waitforAlertPresent(timeout).getText();
	}
}
