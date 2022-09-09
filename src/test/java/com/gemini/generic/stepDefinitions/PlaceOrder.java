package com.gemini.generic.stepDefinitions;

import com.gemini.generic.MobileAction;
import com.gemini.generic.locators.Locators;
import com.gemini.generic.utils.Constants;
import com.gemini.generic.utils.ConstantsVariables;
import com.gemini.reporting.GemTestReporter;
import com.gemini.reporting.STATUS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PlaceOrder {

    @Given("launch the application and login using {string} and {string}")
    public void launch_the_application_and_login_using_and(String username, String password) {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_login, "login");
        MobileAction.typeText(Locators.input_username, username, "username");
        MobileAction.typeText(Locators.input_password, password, "password");
        MobileAction.click(Locators.btn_login, "login");
    }

    @Given("select catalog option")
    public void select_catalog_option() {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_catalog, "catalog");
    }

    @Given("navigate to products page")
    public void navigate_to_products_page() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_productTitle);
        if (title.equals(Constants.PRODUCT_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + Constants.PRODUCT_TITLE
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + Constants.PRODUCT_TITLE
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }

    }

    @When("select a product {string}")
    public void select_a_product(String product) {
        MobileAction.scrollToElement(product, true);
        int size = MobileAction.getElements(Locators.label_productName).size();
        for (int i = 0; i < size; i++) {
            if (MobileAction.getElementsText(Locators.label_productName).get(i).equals(product)) {
                ConstantsVariables.productName =
                        MobileAction.getElementsText(Locators.label_productName).get(i);
                MobileAction.click(MobileAction.getElements(Locators.label_productName).get(i), product);

//                MobileDriverManager.getAppiumDriver().findElements(Locators.label_productName).get(i).click();
                break;
            }
        }
        System.out.println(ConstantsVariables.productName + " selected.");
    }

    @When("click on Add to Cart")
    public void click_on_add_to_cart() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_productPageTitle);
        if (title.equals(Constants.PRODUCT_PAGE_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + Constants.PRODUCT_PAGE_TITLE
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + Constants.PRODUCT_PAGE_TITLE
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }

        MobileAction.click(Locators.btn_addToCart, "add to cart");
    }

    @When("click the cart button")
    public void click_the_cart_button() {
        MobileAction.click(Locators.btn_cart, "cart");
    }

    @Then("verify the cart product")
    public void verify_the_cart_product() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_cartTitle);
        if (title.equals(Constants.CART_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + Constants.CART_TITLE
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + Constants.CART_TITLE
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }
    }

    @Then("click on proceed to checkout")
    public void click_on_proceed_to_checkout() {
        MobileAction.click(Locators.btn_checkout, "checkout");
    }

    @Then("fill the shipping address with {string} {string} {string} {string} {string} {string} {string}")
    public void fill_the_shipping_address_with(String fullName, String addr1, String addr2, String city,
                                               String state, String zipcode, String country) {
        MobileAction.waitSec(2);
        MobileAction.typeText(Locators.input_fullName, fullName, "fullName");
        MobileAction.typeText(Locators.input_addr1, addr1, "address line 1");
        MobileAction.typeText(Locators.input_addr2, addr2, "address line 2");
        MobileAction.typeText(Locators.input_city, city, "city");
        MobileAction.typeText(Locators.input_state, state, "state");
        MobileAction.typeText(Locators.input_zip, zipcode, "zipcode");
        MobileAction.typeText(Locators.input_country, country, "country");
    }

    @Then("click on to payment button")
    public void click_on_to_payment_button() {
        MobileAction.click(Locators.btn_payment, "payment");
    }

    @Then("fill the payment details with {string} {string} {string} {string}")
    public void fill_the_payment_details_with(String cardHolderName, String cardNo, String expDate, String cvv) {
        MobileAction.waitSec(2);
        MobileAction.typeText(Locators.input_cardHolderName, cardHolderName, "card holder name");
        MobileAction.typeText(Locators.input_cardNumber, cardNo, "card no");
        MobileAction.typeText(Locators.input_expDate, expDate, "expiry date");
        MobileAction.typeText(Locators.input_cvv, cvv, "cvv");
    }

    @Then("click on review button")
    public void click_on_review_button() {
        MobileAction.click(Locators.btn_reviewOrder, "review order");
    }

    @Then("verify the review page")
    public void verify_the_review_page() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_reviewTitle);
        if (title.equals(Constants.REVIEW_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + Constants.REVIEW_TITLE
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + Constants.REVIEW_TITLE
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }

        String prodName = MobileAction.getElementText(Locators.label_reviewProductName);
        if (prodName.equals(ConstantsVariables.productName)) {
            GemTestReporter.addTestStep("Verifying Name", "Pass - Expected = " +
                    ConstantsVariables.productName + "<BR>Actual = " + prodName, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Name", "Fail - Expected = " +
                    ConstantsVariables.productName + "<BR>Actual = " + prodName, STATUS.FAIL, MobileAction.takeSnapShot());
        }
    }

    @Then("click on place order button")
    public void click_on_place_order_button() {
        MobileAction.click(Locators.btn_placeOrder, "place order");
    }

    @Then("verify the confirm message")
    public void verify_the_confirm_message() {
        String confirm = MobileAction.getElementText(Locators.label_confirmTitle);
        if (confirm.equals(Constants.CONFIRM_PAGE_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = "
                    + Constants.CONFIRM_PAGE_TITLE + "<BR>Actual = " + confirm, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = "
                    + Constants.CONFIRM_PAGE_TITLE + "<BR>Actual = " + confirm, STATUS.FAIL, MobileAction.takeSnapShot());
        }
    }

    @Then("logout the user")
    public void logout_the_user() {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_logout, "logout");
        MobileAction.click(Locators.btn_logoutConfirm, "logout confirm");
        String confirm = MobileAction.getElementText(Locators.btn_logoutConfirmMsg);
        if (confirm.equals(Constants.CONFIRM_LOGOUT)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = "
                    + Constants.CONFIRM_LOGOUT + "<BR>Actual = " + confirm, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = "
                    + Constants.CONFIRM_LOGOUT + "<BR>Actual = " + confirm, STATUS.FAIL, MobileAction.takeSnapShot());
        }
        MobileAction.click(Locators.btn_logoutClose, "logout close");
    }

    @Then("fail to verify the title")
    public void fail_to_verify_the_title() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_productPageTitle);
        if (title.equals(Constants.PRODUCT_PAGE_WRONG_TITLE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + Constants.PRODUCT_PAGE_WRONG_TITLE
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + Constants.PRODUCT_PAGE_WRONG_TITLE
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }

    }
}
