package com.intive.patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {

    private WebDriver driver;


    @FindBy(how = How.CLASS_NAME,using = "login")
    WebElement SigninButton;

    @FindBy(how = How.CLASS_NAME,using = "sf-with-ul")
    WebElement WomanCart;

    @FindBy(how= How.XPATH,using = "//*[@id=\"header_logo\"]/a")
    WebElement Logo;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SigninButton() {

        SigninButton.click();
    }

    public void WomanCartClick(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(WomanCart));
        WomanCart.click();
    }
    public void Start() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(WomanCart));
        Logo.click();
    }
}
