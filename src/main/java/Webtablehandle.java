import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandle {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		///String grp=getgroupname("UCO Bank");
		//System.out.println(grp);
		System.out.println(getlist("DCB Bank"));

	}

	public static String getgroupname(String companyname)
	{
		return driver.findElement(By.xpath("//a[contains(text(),'"+companyname+"')]/parent::td/following-sibling::td")).getText();
	}
	public static List<String> getlist(String name)
	{
	List<WebElement> list=driver.findElements(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td"));
	List<String> listitems=new ArrayList<String>();
	for(int i=0;i<list.size();i++)
	{
	String text=list.get(i).getText();
	listitems.add(text);
	}
	return listitems;
	}
}
