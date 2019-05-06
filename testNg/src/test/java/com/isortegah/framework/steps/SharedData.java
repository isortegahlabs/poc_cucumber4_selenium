package com.isortegah.framework.steps;

import com.isortegah.framework.libs.selenium.BrowserDriver;
import cucumber.runtime.java.guice.ScenarioScoped;

import java.lang.management.ManagementFactory;

@ScenarioScoped
public class SharedData {

    public String today;
    public String actualAnswer;
    public String urlBase;
    public long threadId = Thread.currentThread().getId();
    public String processName = ManagementFactory.getRuntimeMXBean().getName();
    public int time;
    private String browser;
    private static BrowserDriver browserDriver;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public BrowserDriver getBrowserDriver() {
        return browserDriver;
    }

    public void setBrowserDriver(){
        browserDriver = new BrowserDriver(browser);
        browserDriver.setThreadId(threadId);
    }
}
