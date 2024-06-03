package org.steptwo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources" , glue="org.steptwo" ,monochrome=true, tags= "@Sanity")
public class TestRun {
	


}
