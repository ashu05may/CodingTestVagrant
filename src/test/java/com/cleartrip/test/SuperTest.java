package com.cleartrip.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sun.javafx.PlatformUtil;

public class SuperTest {
	
	WebDriver driver;
	
	@BeforeClass
	void startBrowser()
	{
		//Launch browser
		setDriverPath();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    	//Enter URL
        driver.get("https://www.cleartrip.com/");
		
	}
	
	@AfterClass
	void quitBrowser()
	{
		//close the browser
		driver.quit();
	}
	
	private void setDriverPath() {
    	
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver3.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }
}