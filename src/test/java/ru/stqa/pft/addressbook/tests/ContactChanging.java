package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactChanging extends TestBase {

    
    @Test
    public void ContactChanging() {

        app.getContactHelper().chooseContact();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().clickSubmitContact();
        app.getContactHelper().clickHomeContact();
    }


}
