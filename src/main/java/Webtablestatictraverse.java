
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Webtablestatictraverse 
	{

		static WebDriver driver;
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			////*[@id="customers"]/tbody/tr[2]/td[1]
			////*[@id="customers"]/tbody/tr[3]/td[1]
			///for(int i=2;i<=7;i++)
			//{
			//String xpath="//*[@id=\"customers\"]/tbody/tr["+i+"]/td[1]";
			//System.out.println(xpath);
			//String text=driver.findElement(By.xpath(xpath)).getText();
			//System.out.println(text);
		//	}
			By rows=By.xpath("//*[@id='customers']/tbody/tr");
			String before="//*[@id=\"customers\"]/tbody/tr[";
			String after="]/td[1]";
			int rowcount=getrowcount(rows);
			System.out.println(rowcount);
		rowelement(rows,before,after);
//System.out.println(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText());
	}
		
public static int getrowcount(By locator)
{
	return driver.findElements(locator).size();
}


public static int getcolumncount(By locator)
{
	return driver.findElements(locator).size();
}
public static void rowelement(By rows,String before,String after)
{
	for(int row=2;row<=getrowcount(rows);row++)
	{
	String xpath=before+row+after;
	//System.out.println(xpath);
	String text=driver.findElement(By.xpath(xpath)).getText();
	System.out.println(text);
	}
}
}
