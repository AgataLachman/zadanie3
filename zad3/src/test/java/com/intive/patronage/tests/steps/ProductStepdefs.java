package com.intive.patronage.tests.steps;

import com.intive.patronage.tests.DriverFactory;
import com.intive.patronage.tests.pages.ProductPage;
import com.intive.patronage.tests.pages.StartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductStepdefs extends DriverFactory {
    @When("^I go on \"([^\"]*)\" cart$")
    public void iGoOnCart(String arg0) {
        StartPage startPage = new StartPage(driver);
        startPage.WomanCartClick();

    }

    @And("^I click first product$")
    public void iClickFirstProduct() {
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickFirstProduct();

    }

    @And("^I click button 'Add to cart'$")
    public void iClickButtonAddToCart()  {
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickAddToCartButton();
    }

    @And("^I click button 'Proceed to checkout'$")
    public void iClickButtonProceedToCheckout()  {
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickProceedToCheckoutButton();
    }
    @And("^I click button 'Proceed to checkout' again$")
    public void iClickButtonProceedToCheckoutAgain(){
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickProceedToCheckoutButton2();
    }
    @And("^I click button  'Proceed to checkout'$")
    public void iClickButtonProceedToCheckout3()  {
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickProceedToCheckoutButton3();
    }
    @And("^I click  button 'Proceed to checkout'$")
    public void iClickButtonProceedToCheckout4(){
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickProceedToCheckoutButton4();
    }
    @And("^I agree to the terms of service$")
    public void iAgreeToTheTermsOfService() {
        ProductPage productPage = new ProductPage(driver);
        productPage.ClickAgreeCheckbox();

    }
    @And("^I click button 'Pay by check'$")
    public void iClickButtonPayByCheck() {

    }
    @And("^I click button ' confirm my order'$")
    public void iClickButtonConfirmMyOrder()  {

    }

    @Then("^My Order on My Store is complete$")
    public void myOrderOnMyStoreIsComplete() {

    }

    @Given("^I on My account page$")
    public void iOnMyAccountPage() {

    }
    @And("^I click button Order history and details'$")
    public void iClickButtonOrderHistoryAndDetails()  {

    }

    @Then("^I see my correct order$")
    public void iSeeMyCorrectOrder() {
    }



}
