package com.gemini.generic.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    //    Menu
    public static By btn_menu = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    public static By list_login = AppiumBy.accessibilityId("menu item log in");
    public static By list_logout = AppiumBy.accessibilityId("menu item log out");
    public static By list_catalog = AppiumBy.accessibilityId("menu item catalog");


    //    Login Page
    public static By input_username = AppiumBy.accessibilityId("Username input field");
    public static By input_password =AppiumBy.accessibilityId("Password input field");
    public static By btn_login = AppiumBy.accessibilityId("Login button");

    // Logout Page
    public static By btn_logoutConfirm = AppiumBy.id("android:id/button1");
    public static By btn_logoutConfirmMsg = AppiumBy.id("android:id/alertTitle");
    public static By btn_logoutClose = AppiumBy.id("android:id/button1");



    //    Product Page
    public static By label_productTitle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
    public static By img_product = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"store item text\"]");
    public static By label_productName = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"store item text\"]");
    public static By label_productPrice = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"store item price\"]");

    //    Selected Product Page
    public static By label_productPageTitle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
    public static By label_productPagePrice = AppiumBy.accessibilityId("product price");
    public static By btn_addToCart = AppiumBy.accessibilityId("Add To Cart button");
    public static By btn_cart = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView");

    //    Cart Page
    public static By label_cartTitle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
    public static By label_cartProductName = AppiumBy.accessibilityId("product label");
    public static By label_cartProductPrice = AppiumBy.accessibilityId("product price");
    public static By btn_removeItem = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"remove " +
            "item\"]/android.widget.TextView");
    public static By btn_checkout = AppiumBy.accessibilityId("Proceed To Checkout button");
    public static By label_emptyCartMsg = AppiumBy.xpath("//android.view.ViewGroup[@content-desc" +
            "=\"container header\"]/android.widget.TextView");

    //    Checkout - Address Page
    public static By label_addressTitle = AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"checkout address screen\"]/android.view.ViewGroup/android.widget.TextView[1]");
    public static By input_fullName = AppiumBy.accessibilityId("Full Name* input field");
    public static By input_addr1 = AppiumBy.accessibilityId("Address Line 1* input field");
    public static By input_addr2 = AppiumBy.accessibilityId("Address Line 2 input field");
    public static By input_city = AppiumBy.accessibilityId("City* input field");
    public static By input_state = AppiumBy.accessibilityId("State/Region input field");
    public static By input_zip = AppiumBy.accessibilityId("Zip Code* input field");
    public static By input_country = AppiumBy.accessibilityId("Country* input field");
    public static By btn_payment = AppiumBy.accessibilityId("To Payment button");

    //    Checkout - Payment Page
    public static By label_paymentTitle = AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"checkout payment screen\"]/android.view.ViewGroup/android.widget.TextView[1]");
    public static By input_cardHolderName = AppiumBy.accessibilityId("Full Name* input field");
    public static By input_cardNumber = AppiumBy.accessibilityId("Card Number* input field");
    public static By input_expDate = AppiumBy.accessibilityId("Expiration Date* input field");
    public static By input_cvv = AppiumBy.accessibilityId("Security Code* input field");
    public static By btn_reviewOrder = AppiumBy.accessibilityId("Review Order button");

    //    Review Page
    public static By label_reviewTitle = AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"checkout review order screen\"]/android.view.ViewGroup/android.widget.TextView");
    public static By label_reviewProductName = AppiumBy.accessibilityId("product label");
    public static By label_reviewProductPrice = AppiumBy.accessibilityId("product price");
    public static By btn_placeOrder = AppiumBy.accessibilityId("Place Order button");

    //    Confirm Page
    public static By label_confirmTitle = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"checkout complete screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");


}
