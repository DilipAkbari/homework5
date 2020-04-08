package org.wcht.testsuite;

import org.testng.annotations.Test;
import org.wcht.pages.HomePage;
import org.wcht.testbase.TestBase;

public class MouseHowerTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void varifyUserShouldNotClickToYourAccount() {
        homePage.mouseHowerpayYourRentDropdownLink();
        homePage.mouseHoweryourAccountDropdownLink();
    }

}
