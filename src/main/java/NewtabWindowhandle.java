import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtabWindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String parentid=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
