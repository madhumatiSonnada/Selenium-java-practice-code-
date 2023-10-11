import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();
	String parentwindowId=it.next();
			String childwindowId=it.next();
			driver.switchTo().window(childwindowId);
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(parentwindowId);
			System.out.println(driver.getTitle());
	

	}

}
