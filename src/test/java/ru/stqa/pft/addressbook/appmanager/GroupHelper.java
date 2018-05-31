package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void selectGroup() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      click(By.name("selected[]"));
    }
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void editGroupCreation() {
    click(By.name("update"));
  }

  public void changeGroupForm() {
    type(By.name("group_name"), "test 1");
    type(By.name("group_header"), "test 2");
    type(By.name("group_footer"), "test 3");
  }

  public void clickEditGroup() {
    click(By.name("edit"));
  }
}
