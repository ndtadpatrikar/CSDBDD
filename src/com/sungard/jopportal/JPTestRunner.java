package com.sungard.jopportal;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/com/sungard/jopportal"})
public class JPTestRunner {

}
