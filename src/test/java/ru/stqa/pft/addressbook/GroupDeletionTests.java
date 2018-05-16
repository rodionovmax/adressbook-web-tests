package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.gotoGroupPage();
    }

//    private void deleteSelectedGroups() {
//        app.
//    }

//    private void selectGroup() {
//
//    }

}
