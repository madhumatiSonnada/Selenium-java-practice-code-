import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasic 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users"
				+ "\\owner\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		if(title.contains("Google"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		//String source=driver.getPageSource();
		//System.out.println(source);
		System.out.println(driver.getPageSource().contains("Google"));
		driver.close();
		
	}

}
