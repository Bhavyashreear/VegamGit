package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
@FindBy(id="username")
private WebElement UnTbox;

@FindBy(name="password")
private WebElement pwdTbox;

@FindBy(xpath="//button[name='login']")
private WebElement Loginbtn;

public Loginpage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setusername(String un)
{
	UnTbox.sendKeys(un);
}
public void detpassword(String pwd)
{
	pwdTbox.sendKeys(pwd);
}
public void clickLogin()
{
	Loginbtn.click();
}

}
