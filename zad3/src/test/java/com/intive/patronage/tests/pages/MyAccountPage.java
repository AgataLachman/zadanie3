package com.intive.patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(how= How.LINK_TEXT,using = "http://automationpractice.com/index.php?controller=identity")
    WebElement InformationButton;


    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickInformationButton() {
        InformationButton.click();
        
            }
}
