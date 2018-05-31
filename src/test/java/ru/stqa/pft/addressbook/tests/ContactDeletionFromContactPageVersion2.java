package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionFromContactPageVersion2 extends TestBase{

    @Test
    public void ContactDeletionFromContactPageVersion2() {
        //wd.findElement(By.linkText("home")).click();
        app.getContactHelper().clickHomeContact();
        /*if (!wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input")).isSelected()) {
            wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input")).click();
        }*/
        app.getContactHelper().chooseContactFromList();
        app.getContactHelper().clickDeleteContactVersion2();
        //app.getContactHelper().clickDeleteContact();
        app.getContactHelper().clickContactConfirmation();
        //wd.findElement(By.linkText("home")).click();
        app.getContactHelper().clickHomeContact();
    }




}
