////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 16 - Crear la clase Task para abrir el Browser. 
// 26 - Generar el implements Task , Importar el implemt
// 27 - Ordenar el overrit y el MEtodo At que se creo automatico en la task del stepdefinition.
// 28 - REfactorizar el performable del metoso por el nombre de laclase OpenTheBrowse
// 29 - Adicionamos el return Instrument :return instrumented(OpenTheBrowser.class, page);
// 30 - Adicionamos el constructor del Page object para el llamdo de los web element 
// 31 - Actualziar el import de Scremply a Instrument 
// 32 - Crear la tarea actor.attemptsTo(Open.browserOn(page)); que es la tarea para ejecutar
// 33 - Agregar un sleep para tener el browser abierto y ver la ejecucion
// 34 - Importar la Util del sleep
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package co.com.computrabajo.qa.computrabajo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.computrabajo.exeptions.BrowserNotLoadedException;
import co.com.computrabajo.qa.computrabajo.utils.ConsoleMessageUtilDataDriven;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class OpenTheBrowser implements Task{

	
	private PageObject page;

	// Cobstructor para asignar un valor inicializar el valor del PageObject
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		ConsoleMessageUtilDataDriven.printMessage("cargaBrowser");
		ConsoleMessageUtilDataDriven.printMessage("cargaPagina");
		
		//actor.attemptsTo(Open.browserOn(page));
		//SleepUtil.sleepSeconds(2);
		
		try {
            actor.attemptsTo(Open.browserOn(page));
            SleepUtil.sleepSeconds(2);
        } catch (Exception e) {
            throw new BrowserNotLoadedException("No se pudo cargar el navegador.", e);
        }
		
			
	}
	
	public static OpenTheBrowser at(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenTheBrowser.class, page);
	}

}
