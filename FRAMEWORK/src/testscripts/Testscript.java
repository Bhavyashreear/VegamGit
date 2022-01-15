package testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import pom.Loginpage;

public class Testscript 
{
	public static void main(String[]args, String url) throws InterruptedException
	{
	
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
driver.get(url);
 Thread.sleep(2000);
 Loginpage lp = new Loginpage(driver);
 lp.setusername("bhavyashreear49@gmail.com");
 Thread.sleep(2000);
 lp.detpassword("Bhavya@4995");
 Thread.sleep(2000);
 lp.clickLogin();
	}


}
