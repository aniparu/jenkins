package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement btnSignin;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnSignin() {
		return btnSignin;
	}

	
	
	

}
