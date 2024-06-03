package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccPojo extends BaseClass {
	
	public CreateAccPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Firstname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement Secondname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getSecondname() {
		return Secondname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

}
