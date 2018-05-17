package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupEditing extends TestBase {

    @Test
    public void GroupEditing() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickEditGroup();
        app.getGroupHelper().changeGroupForm();
        app.getGroupHelper().editGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

}
