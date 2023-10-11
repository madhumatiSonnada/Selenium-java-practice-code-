import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class opencardrelative 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/register");
				
	WebElement el=	driver.findElement(By.linkText("Privacy Policy"));
	driver.findElement(with(By.tagName("input")).toRightOf(el)).click();
	driver.findElement(with(By.cssSelector(".btn.btn-primary")).toRightOf(el)).click();


	}

}
