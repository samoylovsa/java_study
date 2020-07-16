package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.goToPageGroup();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Test4", "t5", "t6"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }
}
