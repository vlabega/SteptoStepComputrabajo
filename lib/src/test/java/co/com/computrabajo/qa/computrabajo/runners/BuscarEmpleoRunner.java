package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BuscarEmpleo.feature", 
        glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions",
        tags = "@BuscarEmpleo",
		snippets = CucumberOptions.SnippetType.CAMELCASE
        
)
public class BuscarEmpleoRunner {
    public static void main(String[] args) {
        ///byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
        //System.exit(exitStatus);
    	Main.run(args, Thread.currentThread().getContextClassLoader());
    }
}

