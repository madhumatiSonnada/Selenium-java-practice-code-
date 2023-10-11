

	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Multiplewindowass2 
	{
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
			driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
			driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
			
		
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String orangemainpage=it.next();
			String linkedin=it.next();
		String facebook=it.next();
			String twitter=it.next();
			String youtube=it.next();
			
			
		//Switching to first child
			
			
		driver.switchTo().window(linkedin);
		System.out.println(driver.getTitle());
			driver.close();
			//Switching back to parent
			driver.switchTo().window(orangemainpage);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			//Clicking on faceboo
				
			driver.switchTo().window(facebook);
			System.out.println(driver.getTitle());
				driver.close();
				//Switching back to parent
				driver.switchTo().window(orangemainpage);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				
				driver.switchTo().window(twitter);
				System.out.println(driver.getTitle());
					driver.close();
					//Switching back to parent
					driver.switchTo().window(orangemainpage);
					System.out.println(driver.getTitle());
					Thread.sleep(2000);
		
					
					driver.switchTo().window(youtube);
					System.out.println(driver.getTitle());
						driver.close();
						//Switching back to parent
						driver.switchTo().window(orangemainpage);
						System.out.println(driver.getTitle());
						
		}

	}


