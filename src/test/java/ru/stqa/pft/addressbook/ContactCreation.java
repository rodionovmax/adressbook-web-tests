package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactCreation extends TestBase {
    //FirefoxDriver wd;
    
    //@BeforeMethod
    /*public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }*/

    /*private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }*/

    @Test
    public void ContactCreation() {

        gotoContact();
        fillContactForm(new ContactData("Mikhail", "Portnov", "Senior developer", "Company", "1 Foxborough st", "(123)456-5678", "blank@fakemail.com", "blank.automation.com", "1990"));
       // wd.findElement(By.name("theform")).click();
       // wd.findElement(By.name("address2")).click();
        submitContact();

    }

    private void fillContactForm(ContactData contactData) {
        app.wd.findElement(By.name("firstname")).click();
        app.wd.findElement(By.name("firstname")).clear();
        app.wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        app.wd.findElement(By.name("lastname")).click();
        app.wd.findElement(By.name("lastname")).clear();
        app.wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        app.wd.findElement(By.name("nickname")).click();
        app.wd.findElement(By.name("title")).click();
        app.wd.findElement(By.name("title")).clear();
        app.wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
        app.wd.findElement(By.name("company")).click();
        app.wd.findElement(By.name("company")).clear();
        app.wd.findElement(By.name("company")).sendKeys(contactData.getCompany_name());
        app.wd.findElement(By.name("address")).click();
        app.wd.findElement(By.name("address")).clear();
        app.wd.findElement(By.name("address")).sendKeys(contactData.getFirst_address());
        //wd.findElement(By.name("address")).click();
        //wd.findElement(By.name("address")).click();
        //wd.findElement(By.name("address")).clear();
        //wd.findElement(By.name("address")).sendKeys("1 Foxborough st");
        app.wd.findElement(By.name("home")).click();
        app.wd.findElement(By.name("home")).clear();
        app.wd.findElement(By.name("home")).sendKeys(contactData.getHomephone());
        app.wd.findElement(By.name("email")).click();
        app.wd.findElement(By.name("email")).clear();
        app.wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
        app.wd.findElement(By.name("homepage")).click();
        app.wd.findElement(By.name("homepage")).clear();
        app.wd.findElement(By.name("homepage")).sendKeys(contactData.getWebsite());
        if (!app.wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
            app.wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).click();
        }
        if (!app.wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
            app.wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).click();
        }
        app.wd.findElement(By.name("byear")).click();
        app.wd.findElement(By.name("byear")).clear();
        app.wd.findElement(By.name("byear")).sendKeys(contactData.getBirth_year());
    }

    private void submitContact() {
        app.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void gotoContact() {
        app.wd.findElement(By.linkText("add new")).click();
    }

    /*@AfterMethod
    public void tearDown()
    {
        logout();
        wd.quit();
    }

    private void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }*/

    /*public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }*/
}
