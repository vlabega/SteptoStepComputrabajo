package co.com.computrabajo.qa.computrabajo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.computrabajo.userinterface.CompuTrabajoHomePanel;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheAuthenticate implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public OpenTheAuthenticate(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		System.out.println("abrir el Panel para Validar Usuario Logeado");
		actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_ICONPANEL));
		System.out.println("Selecciona opcion Ingresar para autenticar el usuario");
		actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INGRESAR));
		SleepUtil.sleepSeconds(2);
		
		//actor.attemptsTo(Enter.theValue(actor.getUsername()).into(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL);
					
		SleepUtil.sleepSeconds(5);
		
	}
	
	public static OpenTheAuthenticate withThe(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(OpenTheAuthenticate.class, page);
	}

}
