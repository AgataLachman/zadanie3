package com.intive.patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    WebElement FormEmail;

    @FindBy(how = How.ID, using = "passwd")
    WebElement FormPassword;

    @FindBy(how = How.ID, using = "SubmitLogin")
    WebElement SingInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/ol/li")
    WebElement ErrorMessage;


    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Form(String login, String password) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(FormEmail));
        FormEmail.sendKeys(login);
        FormPassword.sendKeys(password);
    }

    public void ClickSingInButton() {
        SingInButton.click();
    }

    public void CheckErrorMessage(String expectedError) {
        String actualError = ErrorMessage.getText();
        Assert.assertEquals(expectedError, actualError);

    }


}
