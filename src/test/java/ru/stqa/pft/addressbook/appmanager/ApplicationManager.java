package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  WebDriver wd;

  private ContactHelper contactHelper;
  private SessionHelper sessionHelper; //делаем ссылку на SessionHelper
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  //метод создания сессии init
  public void init() {
    if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    }
    else if (browser.equals(BrowserType.CHROME)){
      wd = new ChromeDriver();
    }
    else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    }
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);//чтобы ContactHelper получил на нее ссылку передаем ее в качестве параметра в конструктор
    navigationHelper = new NavigationHelper(wd);//чтобы NavigationHelper получил на нее ссылку передаем ее в качестве параметра в конструктор
    sessionHelper = new SessionHelper(wd); // инициализируем ссылку SessionHelper
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public void logout() {
      wd.findElement(By.linkText("Logout")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

}

