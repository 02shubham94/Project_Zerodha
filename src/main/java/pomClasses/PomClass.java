package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomClass {
	@FindBy(xpath="//*[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath="//*[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//*[@name='reg_email__']")
	private WebElement email;
	@FindBy(xpath="//*[@name='reg_email_confirmation__']")
	private WebElement confirmEmail;
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	@FindBy(xpath="//*[@title='Day']")
	private WebElement day;
	@FindBy(xpath="//*[@name='birthday_month']")
	private WebElement month;
	@FindBy(xpath="//*[@name='birthday_year']")
	private WebElement year;
	@FindBy(xpath="(//*[@name='sex'])[1]")
	private WebElement female;
	@FindBy(xpath="(//*[@name='sex'])[2]")
	private WebElement male;
	@FindBy(xpath="(//*[@name='sex'])[3]")
	private WebElement other;
	
	public PomClass(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterFname(String Fname) {
		firstName.sendKeys(Fname);
	}
	
	public void enterLastname(String Lname) {
		lastName.sendKeys(Lname);
	}
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void confirmEmail(String Cmail) {
		confirmEmail.sendKeys(Cmail);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void selectDay(String Day) {
		Select sel = new Select(day);
		sel.selectByValue(Day);
	}
	
	public void selectMonth(String Month) {
		Select sel = new Select(month);
		sel.selectByVisibleText(Month);
	}
	
	public void selectYear(String Year) {
		Select sel = new Select(year);
		sel.selectByValue(Year);
	}
	
	public void selectFsex() {
		female.click();
	}
	
	public void selectMsex() {
		male.click();
	}
	
	public void selectOsex() {
		other.click();
	}
}
