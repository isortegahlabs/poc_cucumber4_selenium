package com.isortegah.framework.steps;

import com.google.inject.Inject;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.management.ManagementFactory;

public class GivenStepsLambda implements En {

    private SharedData sharedData;
    private static final Logger logger = LogManager.getLogger();

    //Lambda-steps inside Constructors opcion mas usada
    @Inject
    public GivenStepsLambda(SharedData sharedData) {
        this.sharedData = sharedData;

        GivenStepsLambdaSteps();
        Given("^the domain \"([^\"]*)\"$", (String urlbase) -> this.sharedData.urlBase = urlbase);


    }

    //Lambda-steps inside method
    private void GivenStepsLambdaSteps() {
        Before((Scenario scenario) -> {
            long threadId = Thread.currentThread().getId();
            String processName = ManagementFactory.getRuntimeMXBean().getName();
            logger.info("Before scenario : " + scenario.getName() + "Started in thread: " + threadId + ", in JVM: " + processName);
        });

        After((Scenario scenario) -> {
            logger.info("After scenario : " + scenario.getName());
        });

        Given("^A connection \"([^\"]*)\"$", (String urlBase) -> {
            this.sharedData.urlBase = urlBase;
            logger.info("URL base --> " + sharedData.urlBase);
        });


    }
}