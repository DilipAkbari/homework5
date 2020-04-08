package org.wcht.pages;

import org.openqa.selenium.By;
import org.wcht.utility.Utility;

public class HomePage extends Utility {
    By yourAccountDropdownLink = By.xpath("//span[contains(text(),'Your account')]");
    By payYourRentDropdownLink = By.xpath("//div[@class='site-wide']//div[@class='button-block__txt-inner'][contains(text(),'Pay your rent')]");

    public void mouseHoweryourAccountDropdownLink() {
        mouseHoverToElement(yourAccountDropdownLink);

    }

    public void mouseHowerpayYourRentDropdownLink() {
        mouseHoverToElement(payYourRentDropdownLink);
    }
}
