package com.demoApp.library;

import io.appium.java_client.AppiumDriver;

/**
 * This class is used to set threads for Appium driver which will help to perform parallel execution
 */

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class ThreadLocalDriver {

    private static ThreadLocal<AppiumDriver> tlDriver = new ThreadLocal<>();

    public synchronized static void setTLDriver(AppiumDriver driver) {
        tlDriver.set(driver);
    }

    public synchronized static AppiumDriver getTLDriver() {
        return tlDriver.get();
    }
}
