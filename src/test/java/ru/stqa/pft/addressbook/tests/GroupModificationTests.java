package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupModificationTests extends TestBase {

    @Test
    public void GroupEditing() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();//initialize before modification verification of groups quantity
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test HEADER", "test FOOTER"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickEditGroup();
        app.getGroupHelper().changeGroupForm();
        app.getGroupHelper().editGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount(); //
        Assert.assertEquals(after, before);
    }

}
