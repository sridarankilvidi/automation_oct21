package testCases;

import org.testng.annotations.Test;

import pageObjects.hrm_login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TC001_login {
	
	hrm_login hrmlogin;
	hrm_init hrminit;
	
  @Test(priority=0, enabled = true)
  public void login() throws InterruptedException {
	  hrmlogin = new hrm_login(hrminit.driver);
	  hrmlogin.login("admin", "admin123");
	  Thread.sleep(3000);
  }
  @BeforeClass
  public void init() {
	  hrminit = new hrm_init();
	  hrminit.openBrowser();
	  hrminit.openApp();
	  
  }

  @AfterClass
  public void afterClass() {
	  hrminit.driver.quit();
  }

}
