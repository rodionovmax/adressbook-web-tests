package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactChanging extends TestBase {

    
    @Test
    public void ContactChanging() {

        app.chooseContact();
        app.clickEditContact();
        app.clickSubmitContact();
        app.clickHomeContact();
    }


}
