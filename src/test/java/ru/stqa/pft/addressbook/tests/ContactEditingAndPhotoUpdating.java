package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class ContactEditingAndPhotoUpdating extends TestBase {
    FirefoxDriver wd;

    @Test
    public void ContactEditingAndPhotoUpdating() {

        app.getContactHelper().orderingByLastname();
        app.getContactHelper().orderingByLastname();
        /*if (!wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input")).isSelected()) {
            wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input")).click();
        }*/
        app.getContactHelper().chooseContactFromList();
      //wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().changeFirstname();
        app.getContactHelper().changeLastname();
        app.getContactHelper().changeContactAddress();
        app.getContactHelper().clickUploadPhoto();
        app.getContactHelper().clickUpdateContactForm();
        app.getContactHelper().clickGoToHomePage();
        app.getContactHelper().clickContactDetails();
        app.getContactHelper().clickGoToHome();
    }


}
