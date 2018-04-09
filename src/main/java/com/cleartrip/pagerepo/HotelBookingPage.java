package com.cleartrip.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage {
	
	 WebDriver driver;
	
	 public HotelBookingPage(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
	    
    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;
    
    public WebElement getHotelLink()
    {
		return hotelLink;
    }

    @FindBy(id = "Tags")
    private WebElement localityTextBox;
    
    public WebElement getlocalityTextBox()
    {
		return localityTextBox;	
    }

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;
    
    public WebElement getsearchButton()
    {
		return hotelLink;	
    }

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
    
    public WebElement gettravellerSelection()
    {
		return travellerSelection;	
    }
}