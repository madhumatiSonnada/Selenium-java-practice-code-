import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableclick {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//By xpath=By.xpath("//strong[contains(text(),'Albania')]/parent::td/preceding-sibling::td/input[@type='checkbox']");
		clickelement("Austria");
		//clickelement("Fiji");
	}
	public static void clickelement(String name)
	{
		driver.findElement(By.xpath("//strong[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
