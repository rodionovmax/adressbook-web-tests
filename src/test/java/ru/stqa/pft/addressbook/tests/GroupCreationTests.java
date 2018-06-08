package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount(); //method initialization
        app.getGroupHelper().createGroup(new GroupData("test created for demo", "test promo HEADER", null));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
        //app.getGroupHelper().initGroupCreation();
        //app.getGroupHelper().fillGroupForm(new GroupData("test created for demo", "test promo HEADER", null));
        //app.getGroupHelper().submitGroupCreation();
        //app.getNavigationHelper().gotoGroupPage();

    }

}
