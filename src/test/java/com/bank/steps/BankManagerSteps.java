package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import com.bank.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankManagerSteps {
    @Given("^I should click on 'Bank Manager Login' Tab$")
    public void iShouldClickOnBankManagerLoginTab() {
        new BankManagerLoginPage().clickOnBankManagerLoginTab();
    }

    @When("^I should click on Add Customer tab$")
    public void iShouldClickOnAddCustomerTab() {
        new HomePage().setAddCustomerTab();
    }

    @And("^I should enter first name \"([^\"]*)\"$")
    public void iShouldEnterFirstName(String firstname)  {
        new AddCustomerPage().enterFirstName(firstname);

    }

    @And("^I should enter last name \"([^\"]*)\"$")
    public void iShouldEnterLastName(String lastname)  {
        new AddCustomerPage().lastName(lastname);

    }

    @And("^I should enter postcode \"([^\"]*)\"$")
    public void iShouldEnterPostcode(String postcode)  {
        new AddCustomerPage().postCode(postcode);

    }

    @Then("^I click on 'Add Customer' Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();

    }

    @And("^I should verify message 'customer added successfully'$")
    public void iShouldVerifyMessageCustomerAddedSuccessfully() {

        String expectedMessage = "Customer added successfully with customer id :6";
        String actualMessage = new Utility().getTextFromAlert();
        Assert.assertEquals(expectedMessage, actualMessage);
    }



    @Then("^I click 'ok' on popup$")
    public void iClickOkOnPopup() {
        new Utility().acceptAlert();
    }

    @When("^I should click on Open Account Tab$")
    public void iShouldClickOnOpenAccountTab() {
        new HomePage().setOpenAccountTab();
    }

    @And("^I should search customer that created in first test \"([^\"]*)\"$")
    public void iShouldSearchCustomerThatCreatedInFirstTest(String name)  {
        new OpenAccountPage().searchCustomerCreatedFirstTest(name);
    }

    @And("^I Should select currency 'pound'$")
    public void iShouldSelectCurrencyPound() {
        new OpenAccountPage().setCurrency();
    }

    @And("^I click on 'process' button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().setClickOnProcess();
    }

    @Then("^I should verify message 'Account created successfully'$")
    public void iShouldVerifyMessageAccountCreatedSuccessfully() {

        String expectedMessage = "Account created successfully with account Number :1016";
        String actualMessage =  new Utility().getTextFromAlert();
        org.testng.Assert.assertEquals(expectedMessage,actualMessage);

    }

    @And("^I click on 'ok' button on popup$")
    public void iClickOnOkButtonOnPopup() {
        new Utility().alertAccept();
    }
}
