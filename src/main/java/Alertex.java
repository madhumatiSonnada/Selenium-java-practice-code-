import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert alert=driver.switchTo().alert();
	//System.out.println(alert.getText());
	alert.accept();
	String text=driver.findElement(By.id("result")).getText();
	System.out.println(text);
	//
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert confirm=driver.switchTo().alert();
	//System.out.println(alert.getText());
	confirm.dismiss();
	String conftext=driver.findElement(By.id("result")).getText();
	System.out.println(conftext);
	//
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Alert prompt=driver.switchTo().alert();
	prompt.sendKeys("confirmed");
	//System.out.println(alert.getText());
	prompt.accept();
	String text1=driver.findElement(By.id("result")).getText();
	System.out.println(text1);
	}

}
