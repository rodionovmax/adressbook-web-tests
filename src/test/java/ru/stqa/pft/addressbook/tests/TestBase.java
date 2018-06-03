package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
public class TestBase /*extends ApplicationManager*/ {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);//создается ссылка на новый объект типа ApplicationManager

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown()
  {
      app.logout();
      app.stop();
  }

  //public ApplicationManager getApp() {
  //  return app;
  //}



}
