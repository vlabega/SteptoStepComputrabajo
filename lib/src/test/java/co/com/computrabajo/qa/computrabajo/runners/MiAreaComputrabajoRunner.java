package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.core.cli.Main;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/MiAreaComputrabajoRunner.feature", 
        glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions"
)
public class MiAreaComputrabajoRunner {
    public static void main(String[] args) {
        byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
        System.exit(exitStatus);
    }
} 
