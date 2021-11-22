package com.demoApp.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class APIDemoReadAssetScreenPageObjects {


    @AndroidFindBy(xpath = "//*[@text='Content/Assets/Read Asset']")
    public MobileElement lblreadassetheader;

    @AndroidFindBy(xpath = "//*[@resource-id='android:id/content']//android.widget.TextView")
    public MobileElement lblreadassetcontent;

}