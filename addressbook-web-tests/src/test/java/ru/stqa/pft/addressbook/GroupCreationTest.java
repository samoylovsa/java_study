package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        goToPageGroup();
        initGroupCreation();
        fillGroupForm(new GroupData("Test4", "t5", "t6"));
        submitGroupCreation();
        returnToGroupPage();
    }
}
