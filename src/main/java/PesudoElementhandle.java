import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementhandle 
{
static WebDriver driver;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 driver=new ChromeDriver();
		driver.get("https://opencart.antropy.co.uk/index.php?route=account/register");
		
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return window.getComputedStyle(document.querySelector(\"\\label[for='input-firstname']\"),'::before').getPropertyValue('content')";
	//String asterik=js.executeScript(script).toString();
	//System.out.println(asterik);
	String value=getAsteriskvalue(script);
	System.out.println(value);
	
	

	}
	public static String getAsteriskvalue(String script)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js.executeScript(script).toString();
		
	}

}
