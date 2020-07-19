package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationManager extends HelperBase {

    public NavigationManager(WebDriver driver) {
        super(driver);
    }

    public void goToPageGroup() { ;
        click(By.linkText("groups"));
    }
}
