////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 3 - Crear la clase del runner. Esta clase es la clase de Ejecucion de los Steps y el Robot
// 4 - Adicionar el @RunWith para extender una Clase.
// 5 - Adicionar el @CucumberOptions para trabajar con Cucumber
// 6 - Importar el @CucumberOptions y  @RunWith  
// 7 - Agregar al @RunWith(CucumberWithSerenity.class) e importarlo
// 8 - Agregar el GLUE y Featrue al cucumberOptios e importar
// 9 - Agregar los links del feature y de GLUE estos se peuden sacar sin eventualidades por medio de la opcion refactor  
// 10 - Ejecutar el Runer con JUNIT y copiar el codigo que se genera con los stepdefinitions
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.core.cli.Main;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		features = "src/test/resources/features/LoginComputrabajo.feature", 
		glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions"
)

public class LoginComputrabajoRunner {

}
*/


package co.com.computrabajo.qa.computrabajo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.core.cli.Main;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/LoginComputrabajo.feature", 
        glue = "co.com.computrabajo.qa.computrabajo.stepdefinitions"
)
public class LoginComputrabajoRunner {
    public static void main(String[] args) {
        byte exitStatus = Main.run(args, Thread.currentThread().getContextClassLoader());
        System.exit(exitStatus);
    }
} 
