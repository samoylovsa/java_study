package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationManager().goToPageGroup();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }
}
