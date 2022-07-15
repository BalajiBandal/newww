 package patil.kite.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import patil.kite.base.Testbase;

public class homepage extends Testbase {

	@FindBy(xpath="//span[contains(text(),'Positions')]")
	   WebElement Position;
	   

	//  @FindBy(xpath ="//span[contains(text(),'GP8097')]")
	//  WebElement UserID1;
	  //PageFactory
	  @FindBy(id ="userid")
	  WebElement Username; 
	//  driver.fndelement(By.id("userid"));
	  
	  @FindBy(id="password")
	  WebElement Password;
	   
	  @FindBy(xpath ="//button[@type=\"submit\"]")
	  WebElement LoginButton;
	  
	  @FindBy(id="pin")
	  WebElement Pin;
	     
	  @FindBy(xpath ="//button[@type=\"submit\"]")
	   WebElement ContinueButton;
	  
	  @FindBy(xpath ="//span[contains(text(),'GP8097')]")
	  WebElement UserID2;
	  
	  
	  
	public homepage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public boolean validatelogindetail(String UN,String PWD,String PIN) throws InterruptedException {
		Username.sendKeys(UN);
		  Thread.sleep(2000);
		  Password.sendKeys(PWD);
		  Thread.sleep(2000);
		  LoginButton.click();
		  Thread.sleep(2000);
		  Pin.sendKeys(PIN);
		  Thread.sleep(2000);
		  ContinueButton.click();
		  
		  return UserID2.isDisplayed();
	}
}
