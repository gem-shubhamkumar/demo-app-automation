package com.gemini.generic.stepDefinitions;

import com.gemini.generic.MobileAction;
import com.gemini.generic.locators.Locators;
import com.gemini.generic.utils.Constants;
import com.gemini.reporting.GemTestReporter;
import com.gemini.reporting.STATUS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RemoveFromCart {

    @Then("click on remove button for {string}")
    public void click_on_remove_button_for(String item) {
        MobileAction.click(Locators.btn_removeItem, "remove item");
    }


    @And("verify the empty cart")
    public void verify_the_empty_cart() {
        String confirm = MobileAction.getElementText(Locators.label_emptyCartMsg);

        if (confirm.equals(Constants.EMPTY_CART_MESSAGE)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = "
                    + Constants.EMPTY_CART_MESSAGE + "<BR>Actual = " + confirm, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = "
                    + Constants.EMPTY_CART_MESSAGE + "<BR>Actual = " + confirm, STATUS.FAIL, MobileAction.takeSnapShot());
        }
    }
}
