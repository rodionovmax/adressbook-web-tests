package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test promo NAME", "test promo HEADER", "test promo FOOTER"));
        submitGroupCreation();
        gotoGroupPage();

    }

}
