package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactChangingAddress extends TestBase {

    
    @Test
    public void contactChangingAddress() {

        app.chooseContact();
        app.clickEditContact();
        changeFirstAddress();
        app.clickSubmitContact();
    }

    private void changeFirstAddress() {
        app.wd.findElement(By.name("address")).click();
        app.wd.findElement(By.name("address")).click();
        app.wd.findElement(By.name("address")).clear();
        app.wd.findElement(By.name("address")).sendKeys("12 Software Testing st, Palo Alto, 02134");
    }


}
