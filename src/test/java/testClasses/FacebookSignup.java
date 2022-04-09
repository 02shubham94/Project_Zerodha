package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import baseClasses.UtilityClass;
import configuration.PathConfigure;
import pomClasses.PomClass;


public class FacebookSignup {
	WebDriver driver;
	PomClass pom;
	UtilityClass util;
	@BeforeClass
	void launchBrowser() {
		BaseClass base = new BaseClass();
		driver = base.driverinit();
		pom = new PomClass(driver);
		util = new UtilityClass();
		driver.manage().window().maximize(); 
	}
	@BeforeMethod
	void enterURL() {
		driver.get(PathConfigure.facebookSignupUrl);
	}	
	@Test(priority = 1, groups = "male")
	void signUpTest01() throws IOException {
		pom.enterFname(util.getCellData(1, 0));
		pom.enterLastname(util.getCellData(1, 1));
		pom.enterEmail(util.getCellData(1, 2));
		pom.confirmEmail(util.getCellData(1, 3));
		pom.enterPassword(util.getCellData(1, 4));
		pom.selectDay(util.getCellData(1, 5));
		pom.selectMonth(util.getCellData(1, 6));
		pom.selectYear(util.getCellData(1, 7));
		pom.selectMsex();
	}
	@Test(priority = 2, groups = "female")
	void signUpTest02() throws IOException {
		pom.enterFname(util.getCellData(2, 0));
		pom.enterLastname(util.getCellData(2, 1));
		pom.enterEmail(util.getCellData(2, 2));
		pom.confirmEmail(util.getCellData(2, 3));
		pom.enterPassword(util.getCellData(2, 4));
		pom.selectDay(util.getCellData(2, 5));
		pom.selectMonth(util.getCellData(2, 6));
		pom.selectYear(util.getCellData(2, 7));
		pom.selectFsex();
	}
	@Test(priority = 3, groups = "male")
	void signUpTest03() throws IOException {
		pom.enterFname(util.getCellData(3, 0));
		pom.enterLastname(util.getCellData(3, 1));
		pom.enterEmail(util.getCellData(3, 2));
		pom.confirmEmail(util.getCellData(3, 3));
		pom.enterPassword(util.getCellData(3, 4));
		pom.selectDay(util.getCellData(3, 5));
		pom.selectMonth(util.getCellData(3, 6));
		pom.selectYear(util.getCellData(3, 7));
		pom.selectMsex();
	}
	@Test(priority = 4, groups = "female")
	void signUpTest04() throws IOException {
		pom.enterFname(util.getCellData(4, 0));
		pom.enterLastname(util.getCellData(4, 1));
		pom.enterEmail(util.getCellData(4, 2));
		pom.confirmEmail(util.getCellData(4, 3));
		pom.enterPassword(util.getCellData(4, 4));
		pom.selectDay(util.getCellData(4, 5));
		pom.selectMonth(util.getCellData(4, 6));
		pom.selectYear(util.getCellData(4, 7));
		pom.selectFsex();;
	}
	@Test(priority = 5, groups = "male")
	void signUpTest05() throws IOException {
		pom.enterFname(util.getCellData(5, 0));
		pom.enterLastname(util.getCellData(5, 1));
		pom.enterEmail(util.getCellData(5, 2));
		pom.confirmEmail(util.getCellData(5, 3));
		pom.enterPassword(util.getCellData(5, 4));
		pom.selectDay(util.getCellData(5, 5));
		pom.selectMonth(util.getCellData(5, 6));
		pom.selectYear(util.getCellData(5, 7));
		pom.selectMsex();
	}
	@AfterMethod
	void refreshPage() {
		driver.navigate().refresh();
	}
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
}