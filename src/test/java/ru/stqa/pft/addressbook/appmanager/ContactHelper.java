package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

// This class specially made to declare here methods which will fill out the form

public class ContactHelper extends HelperBase {

  //создаем конструктор
  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void clickHomeContact() {
      click(By.linkText("home"));
  }

  public void clickSubmitContact() {
      click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void clickEditContact() {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void chooseContact() {
      if (!wd.findElement(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input")).isSelected()) {
          click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[2]/td[1]/input"));
      }
  }

  public void chooseContactFromList() {
    if (!wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[1]/input")).isSelected()) {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[1]/input"));
    }
  }

  public void clickDeleteContactVersion2() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  public void changeFirstAddress() {
    type(By.name("address"), "34 Software Testing st, Palo Alto, 02134");
    //wd.findElement(By.name("address")).click();
    //wd.findElement(By.name("address")).clear();
    //wd.findElement(By.name("address")).sendKeys("12 Software Testing st, Palo Alto, 02134");
  }

  public void clickDeleteContact() {
    wd.findElement(By.xpath("//div[@id='content']/form[2]/input[2]")).click();
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    //wd.findElement(By.name("firstname")).click();
    //wd.findElement(By.name("firstname")).clear();
    //wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    click(By.name("nickname"));
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany_name());
    type(By.name("address"), contactData.getFirst_address());
    type(By.name("home"), contactData.getHomephone());
    type(By.name("email"), contactData.getEmail());
    type(By.name("homepage"), contactData.getWebsite());

    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
      click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
    }
    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
      click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
    }
    type(By.name("byear"), contactData.getBirth_year());

    // Method for checking if there is drop-down exists
    // If there is drop-down, so choose value. If there is no value, so skip it and proceed further
    // Мы сделали метод который позводяет выполнять проверку наличия или отсутствия элемента и теперь пользуемся этим методом для того чтобы заполнять форму которая содержит эелмент выпадающий список или не содержит
    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());// method for selecting value from drop-down checkbox for contact creation form
    } else {
      Assert.assertFalse(isAlertPresent(By.name("new_group")));
    }
  }

  public void submitContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void clickModifyContactIcon() {
    //click(By.xpath("//div/div[4]/table/tbody/tr[6]/td[7]/a/img"));
    click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[7]/a/img"));
    //img[@alt='Details'])[3]
  }

  public void clickPrintContact() {
    click(By.xpath("div[@id='content']/form[2]/input[2]"));
  }

  public void clickContactConfirmation() {
    wd.switchTo().alert().accept();
  }

  public void clickGoToHome() {
    wd.findElement(By.linkText("home")).click();
  }

  public void clickContactDetails() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[9]/td[7]/a/img")).click();
  }

  public void clickGoToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void clickUpdateContactForm() {
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }

  public void clickUploadPhoto() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[7]")).click();
  }

  public void changeContactAddress() {
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("300 Kenmore st, Boston, 02418");
  }

  public void changeLastname() {
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("Tester");
  }

  public void changeFirstname() {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("Bobby");
  }

  public void orderingByLastname() {
    wd.findElement(By.linkText("Last name")).click();
  }

  public void addNewContact() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void createContact(ContactData contact) {
    //app.getNavigationHelper().gotoContact();
    //clickHomeContact();
    addNewContact();
    fillContactForm(new ContactData("Maksim", "Rodionov", "Senior developer", "Company", "1 Foxborough st", "(123)456-5678", "blank@fakemail.com", "blank.automation.com", "1990", null), true);
    submitContact();
    clickHomeContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }



  /*
  public void clickDeleteContactIcon() {
    wd.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  public void chooseContactToDelete() {
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input")).click();
  }

  public void deleteContactConfirmation() {
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
  }

  public String closeAlertAndGetItsText() {
    try {
      Alert alert = wd.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }*/



}
