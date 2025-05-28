package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class ManageNewsPage  {
public WebDriver driver;
public ManageNewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-news')]")WebElement moreinfo;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newField;
@FindBy(xpath="//textarea[@id='news']")WebElement textField;
@FindBy(xpath="//button[@type='submit']")WebElement saveField;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertField;




public void moreInfo()
{
	moreinfo.click();
}

public void newMethod()
{
newField.click();	
}
public void textFieldMethod(String text)
{
textField.sendKeys(text);	
}

public void save()
{
	saveField.click();
}
public boolean isAlertDisplayed()
{
	return alertField.isDisplayed();

}
}
