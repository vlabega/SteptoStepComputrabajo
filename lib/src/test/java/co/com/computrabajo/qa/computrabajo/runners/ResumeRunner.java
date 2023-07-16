package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/MiAreaComputrabajo.feature", 
        glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions",
        tags = ("@LoginComputrabajo or @MiAreaComputrabajo"),
		snippets = CucumberOptions.SnippetType.CAMELCASE
        
)
public class ResumeRunner {
    public static void main(String[] args) {
        ///byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
        //System.exit(exitStatus);
    	Main.run(args, Thread.currentThread().getContextClassLoader());
    }
}