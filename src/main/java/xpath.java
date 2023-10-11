
public class xpath 
{

	public static void main(String[] args)
	{
		//1)formula
		//----//tagname[@attributename='value']
		//ex://input[@name='email']
		//And---//input[@name='email' and @type='text']
		//or--//input[@name='email' or @type='text']
		//*[@name='firstname']
		
		//2)contains() functions
		//formula--//tagname[contains(@attributename,'value')
		//input[contains(@name,'search')]
		//combination
		////button[@type='submit' and contains(@class,'primary')]
		//multiple contains
		
		//button[contains(@type,'submit')  and contains(@class,'primary')]
		////a[contains(text(),'Amazon')]
		//span[contains(text(),'Best sell') and @class='a-truncate-cut']
		
		//3)text() function
		//formula--htmltag[text()='value']
		//button[text()='Login']
		
		//combination of contains() and text()
		
		//button[text()='Login' and contains(@type,'submit')]
		
		//button[text()='Login' and @type='submit']
		
		//4)starts-with()
		//a[starts-with(text(),'Amazon')]
		//input[starts-with(@id,'ap')]
		//(//a[@class='list-group-item'])[2]
		
		//last()
		//((//section[@class='footer-top-main']//div[@class='footer-main'])[last()]//a)[last()]
		
		//child to parent
		//input[@id='Form_getForm_FullName']/../../../../../../../../../..
		///direct association
		//div[@class='middleColumn']/input[@id='Form_getForm_FullName']
		//or
		//div[@class='middleColumn']/child::input[@name='FullName']
		//input[@name='FullName']/parent::div
		//form[@id='Form_getForm']//div
		
	}

}
