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

import java.util.Set;

public class HybridTest {

    public static String currentTitle = "";

    @Given("select webview option")
    public void select_webview_option() {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_webview, "web-view");
    }

    @When("enter the {string} to search")
    public void enter_the_to_search(String url) {
        MobileAction.typeText(Locators.input_url, getURL(url), "search for - " + url);
    }

    @When("click on go to site button")
    public void click_on_go_to_site_button() {
        MobileAction.click(Locators.btn_goToSite, "go to site");
        MobileAction.switchToWebView();
    }

    @Then("verify the page title")
    public void verify_the_page_title() {
        String title = MobileAction.getTitle(true);
        System.out.println(title + "-----" + currentTitle);
        if (title.equals(currentTitle)) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + currentTitle
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + currentTitle
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }
    }

    @Then("navigate to another {string}")
    public void navigate_to_another(String url) {
        MobileAction.navigateToUrl(getURL(url), true);
    }

    @Then("perform navigate back")
    public void perform_navigate_back() {
        MobileAction.navigateBack(true);
        currentTitle = ConstantsVariables.webList.get(0);
    }

    @Then("perform the navigate forward")
    public void perform_the_navigate_forward() {
        MobileAction.navigateForward(true);
        currentTitle = ConstantsVariables.webList.get(1);
    }

    @Then("perform refresh")
    public void perform_refresh() {
        MobileAction.refresh(true);
    }

    @Then("press back button and switch to native app")
    public void press_back_button_and_switch_to_native_app() {
        MobileAction.pressBackButton(true);
        MobileAction.switchToNativeView();
    }

    public static String getURL(String key) {
        String url = null;
        switch (key) {
            case "GFG" -> {
                url = Constants.GFG;
                currentTitle = Constants.GFG_TITLE;
                ConstantsVariables.webList.add(Constants.GFG_TITLE);
            }
            case "HACKERRANK" -> {
                url = Constants.HACKERRANK;
                currentTitle = Constants.HACKERRANK_TITLE;
                ConstantsVariables.webList.add(Constants.HACKERRANK_TITLE);
            }
            case "GITHUB" -> {
                url = Constants.GITHUB;
                currentTitle = Constants.GITHUB_TITLE;
                ConstantsVariables.webList.add(Constants.GITHUB_TITLE);
            }
            default -> {
                url = Constants.GOOGLE;
                currentTitle = Constants.GOOGLE_TITLE;
                ConstantsVariables.webList.add(Constants.GOOGLE_TITLE);
            }
        }
        return url;
    }


}
