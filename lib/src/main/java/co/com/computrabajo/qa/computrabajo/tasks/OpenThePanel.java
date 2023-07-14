package co.com.computrabajo.qa.computrabajo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.computrabajo.userinterface.ComputrabajoHomePage;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenThePanel implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public OpenThePanel(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Selecciona opcion Ingresar al Panel");
		actor.attemptsTo(Click.on(ComputrabajoHomePage.COMPUTRABAJO_ICONPANEL));
		SleepUtil.sleepSeconds(2);
	}

	public static OpenThePanel at(PageObject page) {
		return instrumented(OpenThePanel.class, page);
	}

}
