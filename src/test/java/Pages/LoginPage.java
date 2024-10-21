package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(id="submit")
	WebElement btnsubmit;
	
	@FindBy(xpath="/html/body/div[1]/div/section/div/div/article/div[1]/h1")
	WebElement veriflogin;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect(String Username,String pwd) {
	username.sendKeys(Username);
	
	password.sendKeys(pwd);
	
	btnsubmit.click();
		
	}
	
	public String verifMessageLogin() {
		String actualText = veriflogin.getText();
		return actualText;
	}

}
