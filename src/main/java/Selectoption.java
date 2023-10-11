import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectoption {

static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//WebElement car=driver.findElement(By.id("cars"));
		//Select select=new Select(car);
		//List<WebElement> caroption=select.getOptions();
		//for(WebElement e:caroption)
		//{
			//String options=e.getText();
			///System.out.println(options);
		//}
		By car=By.id("cars");
	List<String> values=getOptionvalue(car);
	for(String e:values)
	{
		System.out.println(e);
	}
		

	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static List<String> getOptionvalue(By locator)
	{
		Select se=new Select(getElement(locator));
		List<WebElement> options=se.getOptions();
		List<String> optionsvalue=new ArrayList<String>();
		for(WebElement e:options)
		{
			String text=e.getText();
			optionsvalue.add(text);
			
		}
		return optionsvalue;
	}

}
