package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
( 
		features= ".//Feature/login.feature",
  glue="step_definition",
  dryRun = false,
  monochrome=true,
  plugin= {"pretty","html:test-output"}
  )

		  

public class TestRun{
	
}

