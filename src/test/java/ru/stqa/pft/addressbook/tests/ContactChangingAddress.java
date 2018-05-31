package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactChangingAddress extends TestBase {


    @Test
    public void contactChangingAddress() {

        app.getContactHelper().chooseContact();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().changeFirstAddress();
        app.getContactHelper().clickSubmitContact();
        app.getContactHelper().clickHomeContact();
    }

    //public void changeFirstAddress() {

    //}
}
