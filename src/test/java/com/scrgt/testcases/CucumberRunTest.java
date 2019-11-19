package com.scrgt.testcases;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, tags = { "not @exclude",
		"not @Ignore" }, features = "src/test/resources/features", glue = "com.scrgt.testcases")
public class CucumberRunTest {

}