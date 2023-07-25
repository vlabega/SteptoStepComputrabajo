package co.com.computrabajo.qa.computrabajo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ComputrabajoHomeSearchJob extends PageObject{

	public static final Target COMPUTRABAJO_ICONPANEL = Target.the("computrabajo icon Panel").located(By.id("open_menu"));
	public static final Target COMPUTRABAJO_INGRESAR = Target.the("computrabajo INGRESAR").locatedByFirstMatching("/html/body/div[1]/div/div/div[1]/div/div/a[1]");
	public static final Target COMPUTRABAJO_INGRESAR2 = Target.the("computrabajo INGRESAR").located(By.linkText("Ingresar"));
	
}