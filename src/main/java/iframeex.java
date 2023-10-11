import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement target=driver.findElement(By.id("trash"));
		driver.switchTo().frame("google_esf");
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, target).perform();
		

	}

}
