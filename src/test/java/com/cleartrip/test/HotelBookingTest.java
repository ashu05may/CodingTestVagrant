package com.cleartrip.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cleartrip.pagerepo.HotelBookingPage;
import com.sun.javafx.PlatformUtil;

public class HotelBookingTest extends SuperTest{
	
	//WebDriver driver;
	HotelBookingPage obj;
	    
    @Test
    public void shouldBeAbleToSearchForHotels() {
        
        waitFor(2000);
        
        obj = new HotelBookingPage(driver);
        
        obj.getHotelLink().click();
        
        obj.getlocalityTextBox().sendKeys("Indiranagar, Bangalore");

        new Select(obj.gettravellerSelection()).selectByVisibleText("1 room, 2 adults");
        
        obj.getsearchButton().click();

    }

	private void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}