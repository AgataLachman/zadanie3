package com.intive.patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")
    WebElement FirstProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button")
    WebElement AddToCart;

    @FindBy(how = How.XPATH,using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement ProceedToCheckoutButton;

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElement ProceedToCheckoutButton2;

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement ProceedToCheckoutButton3;

    @FindBy(how = How.XPATH,using = "//*[@id=\"form\"]/p/button")
    WebElement ProceedToCheckoutButton4;

    @FindBy(how = How.ID,using = "cgv")
    WebElement AgreeCheckbox;

    @FindBy(how = How.CLASS_NAME,using = "cheque")
    WebElement PayByCheckButton;

    @FindBy(how = How.CLASS_NAME,using = "alert alert-success")
    WebElement CompleteOrderAlert;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(FirstProduct));
        FirstProduct.click();
    }

    public void ClickAddToCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(AddToCart));
        AddToCart.click();
    }

    public void ClickProceedToCheckoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton));
        ProceedToCheckoutButton.click();
    }
    public void ClickProceedToCheckoutButton2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton2));
        ProceedToCheckoutButton2.click();
    }
    public void ClickProceedToCheckoutButton3() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton3));
        ProceedToCheckoutButton3.click();
    }
    public void ClickProceedToCheckoutButton4() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton4));
        ProceedToCheckoutButton.click();
    }

    public void ClickAgreeCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(AgreeCheckbox));
        AgreeCheckbox.click();
    }

    public void ClickPayByCheckButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(PayByCheckButton));
        PayByCheckButton.click();
    }

    public void CheckCompleteOrderAlert(String ActualOrderAlert) {

        String ExpectedOrderAlert = CompleteOrderAlert.getText();
        Assert.assertEquals(ExpectedOrderAlert, ActualOrderAlert);

    }
}
