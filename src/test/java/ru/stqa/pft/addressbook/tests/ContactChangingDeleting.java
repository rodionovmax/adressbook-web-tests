package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

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
