package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "test HEADER", "test FOOTER"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before - 1);
    }



}
