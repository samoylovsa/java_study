package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.goToPageGroup();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnToGroupPage();
  }
}
