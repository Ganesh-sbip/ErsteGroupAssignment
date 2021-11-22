package com.demoApp.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class APIDemoAssetsScreenPageObjects {

    @AndroidFindBy(xpath = "//*[@text='Read Asset']")
    public MobileElement lnkreadasset;
}
