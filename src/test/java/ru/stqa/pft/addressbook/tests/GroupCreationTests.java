package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("test created for demo", "test promo HEADER", null));
        //app.getGroupHelper().initGroupCreation();
        //app.getGroupHelper().fillGroupForm(new GroupData("test created for demo", "test promo HEADER", null));
        //app.getGroupHelper().submitGroupCreation();
        //app.getNavigationHelper().gotoGroupPage();

    }

}
