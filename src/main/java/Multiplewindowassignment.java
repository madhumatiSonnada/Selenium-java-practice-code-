import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		Thread.sleep(2000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId=it.next();
		String child1Id=it.next();
		String child2Id=it.next();
		String child3Id=it.next();
		String child4Id=it.next();
		
		driver.switchTo().window(child1Id);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(child2Id);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(child3Id);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(child4Id);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		driver.quit();
	
	}

}
