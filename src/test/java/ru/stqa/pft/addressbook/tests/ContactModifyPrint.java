package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModifyPrint extends TestBase {

    @Test
    public void testContactModifyPrint() {
        app.getContactHelper().chooseContactFromList();
        app.getContactHelper().clickModifyContactIcon();
        app.getContactHelper().clickPrintContact();
    }
}
