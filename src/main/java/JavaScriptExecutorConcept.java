import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

		public static void main(String[] args) throws InterruptedException {

			//execute js
			//JavaScriptExecutor will help to execute the JS
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
			JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
			//Generate alert--Alert script
			//jsUtil.generateAlert("This is my alert");
			
			//Get page innertext--return document.documentElement.innerText;
			//String text=jsUtil.getPageInnerText();
			//System.out.println(text);
			
			//Get the title--return document.title
		//String title=	jsUtil.getTitleByJS();
		//System.out.println(title);
			
			//refresh browser--histroy.go(0)
		
			jsUtil.refreshBrowserByJS();
			
			//drawborder--arguments[0].style.border='3px solid red'", element
			//WebElement el=driver.findElement(By.xpath("//div[@id='nav-tools']"));
			//jsUtil.drawBorder(el);
			
			//WebElement pwd = driver.findElement(By.id("input-password"));
	//	jsUtil.flash(pwd);
//			pwd.sendKeys("test@123");
			
		//	jsUtil.scrollPageDown();window.scrollTo(0, document.body.scrollHeight)
			//Thread.sleep(2000);
		//jsUtil.scrollPageUp();window.scrollTo(document.body.scrollHeight,0)
			
			//jsUtil.scrollPageDown("500");
	//WebElement ele = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
		///	jsUtil.scrollIntoView(ele);
			
			//infinite loading///lazy page loading
			
			WebElement reg = driver.findElement(By.xpath("//a[@id='nav-orders']"));
			jsUtil.clickElementByJS(reg);
			//click, Actions-click : click is happening on the element on the page
			//JS click: clicking on the element by injecting the java script.

	}

}
