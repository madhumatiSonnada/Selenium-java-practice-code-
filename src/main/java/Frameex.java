import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("content");
		driver.switchTo().frame(driver.findElement(By.name("content")));
		String header=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
