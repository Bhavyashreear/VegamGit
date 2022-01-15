package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Generic_read_excel;
import pom.Facebook_login;

public class ValidLogin {
private WebDriver driver;

@Test
public void getLogged()
{
	String uname = Generic_read_excel.getData("Sheet1", 0, 0);
	String pwd = Generic_read_excel.getData("Sheet1", 0,1);
	Facebook_login fb=new Facebook_login(driver);
	fb.setEmail(uname);
	fb.setEmail(pwd);
	fb.passBtn();
}
}