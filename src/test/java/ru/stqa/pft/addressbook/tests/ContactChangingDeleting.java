package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactChangingDeleting extends TestBase {

   @Test
    public void ContactChangingDeleting() {

        app.getContactHelper().chooseContact();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().clickDeleteContact();
        app.getContactHelper().clickHomeContact();
    }

//    private void clickDeleteContact() {
//        app.
//    }


}
