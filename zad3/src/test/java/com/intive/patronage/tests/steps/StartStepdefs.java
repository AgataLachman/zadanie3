package com.intive.patronage.tests.steps;

import com.intive.patronage.tests.DriverFactory;
import com.intive.patronage.tests.pages.MyAccountPage;
import com.intive.patronage.tests.pages.PersonalInformationPage;
import com.intive.patronage.tests.pages.SigninPage;
import com.intive.patronage.tests.pages.StartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartStepdefs extends DriverFactory {
    @Given("^I  on start page$")
    public void iOnStartPage() {
        new StartPage(driver);
    }

    @When("^I click “Sign in” button$")
    public void iClickSignInButton() {
        StartPage startPage = new StartPage(driver);
        startPage.SigninButton();

    }

    @And("^I enter the email address as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheEmailAddressAsAndPasswordAs(String login, String password) {
        SigninPage form = new SigninPage(driver);
        form.Form(login, password);
    }

    @And("^I click button ,,Sign in\"$")
    public void iClickButtonSignIn() {
        SigninPage SingInButton = new SigninPage(driver);
        SingInButton.ClickSingInButton();
    }

    @And("^I click button ,,My personal information\"$")
    public void iClickButtonMyPersonalInformation() {
        MyAccountPage informationButton = new MyAccountPage(driver);
        informationButton.ClickInformationButton();
    }

    @And("^Information is correct$")
    public void informationIsCorrect() {
        PersonalInformationPage Information = new PersonalInformationPage(driver);
        Information.ValidatePersonalInformation();
    }

    @Then("^Login is successful$")
    public void loginIsSuccessful() {
        destroyDriver();
    }


    @And("^I enter the login as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheLoginAsAndPasswordAs(String login, String password) throws Throwable {
        SigninPage form = new SigninPage(driver);
        form.Form(login, password);
    }


    @Then("^Error message \"([^\"]*)\" is displayed$")
    public void errorMessageIsDisplayed(String expectedError) {
        SigninPage error = new SigninPage(driver);
        error.CheckErrorMessage(expectedError);
        destroyDriver();
    }


    @And("^I go on start page$")
    public void iGoOnStartPage()  {
        StartPage startPage = new StartPage(driver);
        startPage.Start();
    }
}
