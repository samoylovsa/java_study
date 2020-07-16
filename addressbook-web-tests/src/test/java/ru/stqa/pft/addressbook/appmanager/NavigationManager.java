package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationManager {

    private WebDriver driver;

    public NavigationManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPageGroup() {
        driver.findElement(By.linkText("groups")).click();
    }
}
