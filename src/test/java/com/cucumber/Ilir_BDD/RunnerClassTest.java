package com.cucumber.Ilir_BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
  plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  features = "src/test/features",
  glue = {"src/test/java/com/cucumber/Ilir_BDD/AC001_SampleBanking_StepDefinition.java"}
  
  ) 

public class RunnerClassTest {

}
