package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	//1.Non parametrized constructor(page)
		public LoginPojo() {
			
			PageFactory.initElements(driver, this);
			
		}	
		//2. Private WebElement
		//webelement emailId=driver.findelement(by.id("email"));
		@CacheLookup
		@FindBy(id="email")
		private WebElement  username; 
		
		@CacheLookup
		@FindBy(name="pass")
		private WebElement password;
		
		@CacheLookup
		@FindBy(id="u_0_5_Y/")
		private  WebElement btnLogin;
		
		
		@CacheLookup
		@FindBys({
			@FindBy(xpath="//button[text()='Log in']"),
			@FindBy(name="login"),
			@FindBy(xpath="//button[@type='submit']"),
			@FindBy(id="u_0_5_Y/")
		
		})
		
		private  WebElement findBysBtnLogin;
		
		@CacheLookup
		@FindAll({@FindBy(xpath="//button[text()='Log in']"),
			@FindBy(name="login"),
			@FindBy(xpath="//button[@type='submit']"),
			@FindBy(id="u_0_5_Y/")})
		
		private WebElement findAllBtnLogin;
	   
		//3. Getters to access those webelements outside of the class  
		
		public WebElement getFindAllBtnLogin() {
			return findAllBtnLogin;
		}

		public WebElement getFindBysBtnLogin() {
			return findBysBtnLogin;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

}
