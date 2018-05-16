package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactChangingDeleting extends TestBase {

   @Test
    public void ContactChangingDeleting() {

        app.chooseContact();
        app.clickEditContact();
        app.clickDeleteContact();
        app.clickHomeContact();
    }

//    private void clickDeleteContact() {
//        app.
//    }


}
