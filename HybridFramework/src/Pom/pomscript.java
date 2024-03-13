package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Genric.Basepage;

public class pomscript extends Basepage{
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pwd;
@FindBy(xpath="//button[text()='Log in']")
private WebElement ele;
public pomscript(WebDriver driver)
{
	super(driver);
}
public void passdata(String uname)
{
	un.sendKeys(uname);
}
public void pssspwd(String pass)
{
	pwd.sendKeys(pass);
}
public void passele()
{
	ele.click();
}
}
