package com.juliangb.framework.util.reporting;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReportListener implements ConcurrentEventListener {
    private static final String ELASTIC_SEARCH_URL = "http://localhost:9200/automation/suite";
    private static final String executionId = "12sWsa2";

    public void onTestCaseStarted(TestCaseStarted event) {
        TestCase testCase = event.getTestCase();
        System.out.println("Starting" + testCase.getName());


    }

    public void onTestCaseFinished(TestCaseFinished event) {
        ScenarioExecutionInfo scenarioExecutionInfo = new ScenarioExecutionInfo();
        scenarioExecutionInfo.setExecutionId(executionId);
        scenarioExecutionInfo.setId(event.getTestCase().getId().toString());
        scenarioExecutionInfo.setName(event.getTestCase().getName());
        scenarioExecutionInfo.setStatus(event.getResult().getStatus().toString());

        RestAssured.given()
                .body(scenarioExecutionInfo)
                .contentType(ContentType.JSON)
                .when()
                .post(ELASTIC_SEARCH_URL);


        Result result = event.getResult();

        if (result.getStatus() == Status.FAILED) {
            final Throwable error = result.getError();
            error.printStackTrace();

        }


    }

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinished);
    }
}
