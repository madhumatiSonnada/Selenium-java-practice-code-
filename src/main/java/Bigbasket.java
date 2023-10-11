

		import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		public class Bigbasket {

			static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				driver=new ChromeDriver();
				driver.get("https://www.bigbasket.com/");
				WebElement main=driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
				Actions ac=new Actions(driver);
				ac.moveToElement(main).perform();
				
				List<WebElement> level1list=driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
				for(WebElement e1:level1list)
				{
					ac.moveToElement(e1).perform();
					System.out.println(e1.getText());
					
				List<WebElement> level2list=driver.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[4]//a"));
				for(WebElement e2:level2list)
				{
					ac.moveToElement(e2).perform();
					System.out.println(e2.getText());
					List<WebElement> level3list=driver.findElements(By.xpath("(//ul[contains(@class,'list-unstyled')])[5]//a"));
					
					for(WebElement e3:level3list)
					{
					ac.moveToElement(e3).perform();
					System.out.println(e3.getText());
					}
					
					
				}
				
				
				}
				
				
				
				
				
			}

	}


