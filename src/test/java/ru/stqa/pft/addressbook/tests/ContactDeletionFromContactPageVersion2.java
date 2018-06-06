package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionFromContactPageVersion2 extends TestBase{

    @Test
    public void ContactDeletionFromContactPageVersion2() {
        //wd.findElement(By.linkText("home")).click();
        app.getContactHelper().clickHomeContact();
        /*if (!wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input")).isSelected()) {
            wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input")).click();
        }*/
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Johny", "Eagle", " ", "Northrop Grumman", "3 Beacon st", "(831)542-8701", "johnyeagle@fake.com", "eagles.com", "1990", "test 1"));
        }
        app.getContactHelper().chooseContactFromList();
        app.getContactHelper().clickDeleteContactVersion2();
        //app.getContactHelper().clickDeleteContact();
        app.getContactHelper().clickContactConfirmation();
        //wd.findElement(By.linkText("home")).click();
        app.getContactHelper().clickHomeContact();
    }




}
