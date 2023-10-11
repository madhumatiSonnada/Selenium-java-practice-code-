import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class spicejetmouseoveraction {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		By main=By.xpath("//div[text()='Add-ons']");
		By sub= By.linkText("Student Discount");
		
		mouseover(main,sub);
	}

	public static void mouseover(By main,By sub) throws InterruptedException
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(main));
		Thread.sleep(2000);
		driver.findElement(sub).click();
	}
}
