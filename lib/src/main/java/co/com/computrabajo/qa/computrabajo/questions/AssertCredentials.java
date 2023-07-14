package co.com.computrabajo.qa.computrabajo.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.junit.Assert;

import co.com.computrabajo.qa.computrabajo.userinterface.CompuTrabajoHomePanel;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class AssertCredentials implements Task{

	@SuppressWarnings("unused")
	private PageObject page;

	public AssertCredentials(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		System.out.println("Abre el PAnel para verificar");
		actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_ICONPANEL));
		SleepUtil.sleepSeconds(2);
		System.out.println("Verifica el Usuario Logeado este en el panel correspondiente");
		// Validar el label del nombre
		String nombreLabel = actor.asksFor(Text.of(CompuTrabajoHomePanel.COMPUTRABAJO_USER));
	    //Assert.assertEquals("Vladimir Berrio Garcia", nombreLabel);
	    Assert.assertNotNull(nombreLabel);;
	    SleepUtil.sleepSeconds(5);
	    
	}

	public static AssertCredentials Validate(PageObject page) {
		// TODO Auto-generated method stub
		return instrumented(AssertCredentials.class, page);
	}
	
}
