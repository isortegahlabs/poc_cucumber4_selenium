package com.isortegah.framework.steps;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class SharedData {

    public String today;
    public String actualAnswer;
    int time;
}
