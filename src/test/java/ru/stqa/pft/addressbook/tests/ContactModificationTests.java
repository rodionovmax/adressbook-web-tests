package ru.stqa.pft.addressbook.tests;

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
import ru.stqa.pft.addressbook.model.ContactData;

import static org.openqa.selenium.OutputType.*;

public class ContactModificationTests extends TestBase {
    
    @Test
    public void ContactModificationTests() {
       app.getContactHelper().clickHomeContact();
       if (! app.getContactHelper().isThereAContact()){
         app.getContactHelper().createContact(new ContactData("Dominick", "Toreto", " ", "Fast&Furious", "3 Main st", "(123)456-5678", "blank@fakemail.com", "blank.automation.com", "1990", "test 1"));
       }
       app.getContactHelper().chooseContact();
       app.getContactHelper().clickEditContact();
       app.getContactHelper().fillContactForm(new ContactData("Dominick", "Toreto", " ", "Fast&Furious", "3 Main st", "(123)456-5678", "blank@fakemail.com", "blank.automation.com", "1990", null), false);
       app.getContactHelper().clickSubmitContact();
       app.getContactHelper().clickHomeContact();
    }

}
