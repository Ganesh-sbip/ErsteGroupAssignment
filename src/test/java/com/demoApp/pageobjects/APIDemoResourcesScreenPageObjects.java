package com.demoApp.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class APIDemoResourcesScreenPageObjects {

    @AndroidFindBy(xpath = "//*[@text='Layout Reference']")
    public MobileElement lnklayoutreference;

    @AndroidFindBy(xpath = "//*[@text='Resources']")
    public MobileElement lnkresources;

    @AndroidFindBy(xpath = "//*[@text='Smallest Width']")
    public MobileElement lnkreferencewidth;

}
