package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue="com.stepdefinition")//,monochrome=true,dryRun=true,strict=true)
public class TestRunner {

}
