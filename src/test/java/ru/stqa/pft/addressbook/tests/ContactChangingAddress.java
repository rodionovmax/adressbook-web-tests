package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

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
