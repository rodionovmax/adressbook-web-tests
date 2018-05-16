package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.ContactData;

public class ContactCreation extends TestBase {


    @Test
    public void ContactCreation() {

        app.gotoContact();
        app.fillContactForm(new ContactData("Mikhail", "Portnov", "Senior developer", "Company", "1 Foxborough st", "(123)456-5678", "blank@fakemail.com", "blank.automation.com", "1990"));
        app.submitContact();

    }

//    private void fillContactForm(ContactData contactData) {
//
//    }

//    private void submitContact() {
//        app.
//    }

//    private void gotoContact() {
//        app.
//    }


}
