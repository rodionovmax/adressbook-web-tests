package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactChangingAddress extends TestBase {


    @Test
    public void contactChangingAddress() {

        app.chooseContact();
        app.clickEditContact();
        app.changeFirstAddress();
        app.clickSubmitContact();
    }

    //public void changeFirstAddress() {

    //}
}
