package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  // Checking that we are on the groups page
  public void gotoGroupPage() {
    if ( isElementPresent(By.tagName("h1"))
            &&  wd.findElement(By.tagName("h1")).getText().equals("Groups")
            &&  isElementPresent(By.name("New"))) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void gotoContact() {
    if (isElementPresent(By.tagName("th"))
            && wd.findElement(By.tagName("th")).getText().equals("Last name")) {
      return;
    }
    click(By.linkText("add new"));
  }
}

