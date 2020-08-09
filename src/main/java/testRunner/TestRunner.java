package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\madhavi\\eclipse-workspace\\EndClothingAutomation\\src\\test\\java\\features\\MyCartValidations.feature", 
		glue="com.StepDefinitions",
		format= {"pretty","html:test-output"})



public class TestRunner {
	


}
