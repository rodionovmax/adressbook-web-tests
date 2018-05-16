package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactChangingDeleting extends TestBase {

    
    @Test
    public void ContactChangingDeleting() {

        app.chooseContact();
        app.clickEditContact();
        clickDeleteContact();
        app.clickHomeContact();
    }

    private void clickDeleteContact() {
        app.wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
    }


}
