import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil 
{
	public static WebDriver driver;
	
	public WebDriver launchBrowser(String browser)
	{
		System.out.println("Browser name is  "+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users"
					+ "\\owner\\Downloads\\chromedriver-win64"
					+ "\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users"
					+ "\\owner\\Downloads\\chromedriver-win64"
					+ "\\chromedriver-win64\\gecko.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("Enter the valid browser");
		}
		return driver;
	}
	
	public void getUrl(String url)
	{
		if(url==null)
		{
			System.out.println("Not a valid url");
			return;
		}
		if(url.contains("https") || url.contains("http"))
		{
			driver.get(url);
			}
		else
		{
			driver.close();
			try
			{
				
				throw new Exception("INVALIDURLEXCEPTION");
			}
			catch(Exception e)
			{
			System.out.println("please enter the valid url");
			e.printStackTrace();
			}
	}
	}
	public String gettitle()
	{
		return driver.getTitle();	
		}
	
	public void close()
	{
		driver.close();
	}
	public void quit()
	{
		driver.quit();
	}

	public String getpageUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	

	
}
