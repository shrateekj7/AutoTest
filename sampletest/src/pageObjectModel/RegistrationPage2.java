package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {

	WebDriver driver;
	

	@FindBy(how = How.LINK_TEXT , using ="REGISTER")
	//how= variable
	//HOW=class
	WebElement RegLink;
	
	//syntax 1
	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;
	
	//syntax 2
	//@FindBy( name = "firstName")
	//WebElement FirstName;
	
	@FindBy( name = "lastName")
	WebElement LastName;
	
	@FindBy( name = "phone")
	WebElement phone;
	@FindBy( name = "userName")
	WebElement email;
	@FindBy( name = "address1")
	WebElement address1;
	@FindBy( name = "city")
	WebElement city;
	@FindBy( name = "state")
	WebElement state;
	@FindBy( name = "postalCode")
	WebElement postalCode;
	@FindBy( name = "country")
	WebElement country;
	@FindBy( name = "email")
	WebElement username;
	@FindBy( name = "password")
	WebElement password;
	@FindBy( name = "confirmPassword")
	WebElement confirmpassword;
	@FindBy( name = "submit")
	WebElement registerBtn;
	
	RegistrationPage2(WebDriver d){
		//this.driver=driver;
		driver=d;
		PageFactory.initElements(d, this);// additional method
		// this --> variable
	}
	
	public void clickRegLink() {
		RegLink.click();
	}
	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setAddress1(String add1) {
		address1.sendKeys(add1);
	}
	public void setCity(String ci) {
		city.sendKeys(ci);
	}
	public void setState(String st) {
		state.sendKeys(st);
	}
	public void setPostalCode(String pcode) {
		postalCode.sendKeys(pcode);
	}
	public void setCountry(String cn) {
		country.sendKeys("INDIA");
	}
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void setconfirmedPassword(String cpass) {
		confirmpassword.sendKeys(cpass);
	}
	public void clickRegBtn (){
		registerBtn.click();
	}
}
