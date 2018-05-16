package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {
    //FirefoxDriver wd;
    
    //@BeforeMethod
    //public void setUp() throws Exception {
    //    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    //    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //}
    
    @Test
    public void testGroupDeletion() {
        /*wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();*/
        app.gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        //wd.findElement(By.linkText("group page")).click();
        app.gotoGroupPage();
    }

    private void deleteSelectedGroups() {
        app.wd.findElement(By.name("delete")).click();
    }

    private void selectGroup() {
        if (!app.wd.findElement(By.name("selected[]")).isSelected()) {
            app.wd.findElement(By.name("selected[]")).click();
        }
    }

    //@AfterMethod
    //public void tearDown() {
    //    wd.quit();
    //}
    
    //public static boolean isAlertPresent(FirefoxDriver wd) {
    //    try {
    //        wd.switchTo().alert();
    //        return true;
    //    } catch (NoAlertPresentException e) {
    //        return false;
    //    }
    //}
}
