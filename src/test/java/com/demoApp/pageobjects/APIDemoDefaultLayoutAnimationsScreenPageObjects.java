package com.demoApp.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 2.0
 */

public class APIDemoDefaultLayoutAnimationsScreenPageObjects {

    @AndroidFindBy(xpath = "//*[@text='Animation/Default Layout Animations']")
    public MobileElement lbldefaultlayoutanimations;

    @AndroidFindBy(xpath = "//*[@text='ADD BUTTON']")
    public MobileElement btnAddButton;

}
