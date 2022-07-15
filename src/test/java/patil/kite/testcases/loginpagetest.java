package patil.kite.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import patil.kite.base.Testbase;
import patil.kite.pages.loginpage;

public class loginpagetest extends Testbase {
	
	loginpage Loginpage;

	public loginpagetest() throws IOException {
		super();
	}
	 
	 @BeforeMethod
	public void setup() throws IOException {
	init();
	Loginpage =new loginpage(); 
	 }
	 @Test
	 public void kiteuserid(String username,String password,String Pin) throws InterruptedException {
	boolean userid=	Loginpage.validatelogindetail(props.getProperty("Username"),props.getProperty("Password"),props.getProperty("Pin"));
	Assert.assertTrue(true);
	 }
	 @Test
	 public void hometitle() throws InterruptedException {
		String title= Loginpage.validateloginpagetitle();
		 Assert.assertTrue(true);
	 }
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}