package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.PathConfigure;

public class BaseClass {
	public WebDriver driverinit() {
		System.setProperty(PathConfigure.chromekey, PathConfigure.chromepath);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}