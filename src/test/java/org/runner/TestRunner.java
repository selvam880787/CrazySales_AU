package org.runner;

import org.baseclasses.BaseClassCucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featureFiles\\user_login.feature",glue = "org.stepdefinition",dryRun = false,strict = true,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:target\\report1.html","json:target\\report2.json","junit:target\\report3.xml"})
public class TestRunner extends BaseClassCucumber {
@AfterClass
public static void report() {
	generateJvmReport("target\\report2.json");
}
}
