package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrm_login {
	public WebDriver driver;
	hrm_login hrmlogin;
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	//WebElement uname = driver.findElement(By.id("txtUsername"));
	
	@FindBy(name="txtPassword")
	WebElement pwd;
	

	@FindBy(css="#btnLogin")
	WebElement btnLogin;
	
	public hrm_login(WebDriver dr){
		this.driver = dr;
		PageFactory.initElements(dr,this);
	}
	
	public void setUsername(String un) {
		uname.sendKeys(un);
	}
	
	public void setPassword(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void login(String un, String pwd) {
		setUsername(un);
		setPassword(pwd);
		clickLogin();
	}
	
	
}
