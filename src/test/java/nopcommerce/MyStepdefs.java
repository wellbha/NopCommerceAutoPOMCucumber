package nopcommerce;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    RegisterPage register = new RegisterPage();
    HomePage homePage = new HomePage();
    ProductPage product = new ProductPage();
    EmailFriendPage emailFriend = new EmailFriendPage();
    BasketPage basket = new BasketPage();
    CheckOutPage checkout = new CheckOutPage();

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
        homePage.openHomePage();
    }

    @When("^user click on register button$")
    public void userClickOnRegisterButton() {
    }

    @And("^user enter the registration details$")
    public void userEnterTheRegistrationDetails() {
        register.registration();
    }

    @Then("^user click on register button successfully register message should be display$")
    public void userClickOnRegisterButtonSuccessfullyRegisterMessageShouldBeDisplay() {
        register.registrationConfirmation();
    }

    @Given("^registered user is on the home page and logged in$")
    public void registeredUserIsOnTheHomePageAndLoggedIn() {
        homePage.openHomePage();
        register.registration();
    }

    @Then("^user click on the product and click on email friend button$")
    public void userClickOnTheProductAndClickOnEmailFriendButton() {
        product.clickOnProduct();
    }

    @When("^user enter the details and click on sendmail$")
    public void userEnterTheDetailsAndClickOnSendmail() {
        emailFriend.emailFriendForRegisteredUser();
    }

    @Then("^user should be prompted with successful message$")
    public void userShouldBePromptedWithSuccessfulMessage() {
        emailFriend.emailToFriendConfirmationForRegisterUser();
    }

    @Given("^unregistered user is on the home page$")
    public void unregisteredUserIsOnTheHomePage() {
        homePage.openHomePage();
    }

    @Then("^user should be prompted with unsuccessful message$")
    public void userShouldBePromptedWithUnsuccessfulMessage() {
        emailFriend.emailFriendForNonRegisterUser();
        emailFriend.emailToFriendConfirmationForNonRegisterUser();
    }

    @Then("^user click on product and click on add to cart$")
    public void userClickOnProductAndClickOnAddToCart() {
        product.clickOnProduct1();
    }

    @When("^user click on checkout button$")
    public void userClickOnCheckoutButton() {
        basket.checkOutTermsConditions();
    }

    @Then("^user should be prompted with terms and condition error message$")
    public void userShouldBePromptedWithTermsAndConditionErrorMessage() {
        basket.termsConditionConfirmation();
    }

    @Then("^user click on the product and click on add to cart$")
    public void userClickOnTheProductAndClickOnAddToCart() {
        product.clickOnProduct2();
    }

    @When("^user click on checkout button and enter the details$")
    public void userClickOnCheckoutButtonAndEnterTheDetails() {
        checkout.checkOutDetails();
    }

    @Then("^user should be able to display with successful purchase message$")
    public void userShouldBeAbleToDisplayWithSuccessfulPurchaseMessage() {
        checkout.checkOutConfirmation();
    }


    @Given("^Given user is on the home page$")
    public void givenUserIsOnTheHomePage() {
        homePage.openHomePage();
    }

    @When("^user click on product and select sort by with option low to high$")
    public void userClickOnProductAndSelectSortByWithOptionLowToHigh() {
        product.clickOnProduct3();
    }

    @Then("^user should be able to see the product displayed low to high in order$")
    public void userShouldBeAbleToSeeTheProductDisplayedLowToHighInOrder() {
        product.sortProductConfirmation();
    }
}
