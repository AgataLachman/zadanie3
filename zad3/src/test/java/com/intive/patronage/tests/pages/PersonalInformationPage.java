package com.intive.patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "firstname")
    WebElement Firstname;

    @FindBy(how = How.ID, using = "lastname")
    WebElement Lastname;

    @FindBy(how = How.ID, using = "email")
    WebElement Email;


    public PersonalInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ValidatePersonalInformation() {
        String expectedFirstname = "agata";
        String expectedLastname = "agata";
        String expectedEmail = "agata@op.pl";

        String actualFirstname = Firstname.getText();
        String actualLastname = Lastname.getText();
        String actualEmail = Email.getText();

        Assert.assertEquals(expectedFirstname, actualFirstname);
        Assert.assertEquals(expectedLastname, actualLastname);
        Assert.assertEquals(expectedEmail, actualEmail);

    }


}
