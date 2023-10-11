import java.sql.Driver;

public class Test
{

	public static void main(String[] args) 
	{
		BrowserUtil br=new BrowserUtil();
		br.launchBrowser("chrome");
		br.getUrl("htts://www.Google.com");
		String title=br.gettitle();
		if(title.contains("Google"))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		System.out.println(br.getpageUrl());
		br.close();
	}

}
