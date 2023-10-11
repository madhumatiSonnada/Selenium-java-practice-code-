import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relativexpath 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard");
		WebElement ele=driver.findElement(By.linkText("Burma"));
		String right=driver.findElement(with(By.tagName("span")).toRightOf(ele)).getText();
		System.out.println(right);
		String left=driver.findElement(with(By.tagName("a")).toLeftOf(ele)).getText();
		System.out.println(left);
		String above=driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(above);
		String below=driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(below);
		String near=driver.findElement(with(By.tagName("span")).near(ele)).getText();
		System.out.println(near);



	}

}
