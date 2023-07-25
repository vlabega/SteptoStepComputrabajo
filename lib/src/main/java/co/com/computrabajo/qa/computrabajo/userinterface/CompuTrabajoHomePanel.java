package co.com.computrabajo.qa.computrabajo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CompuTrabajoHomePanel extends PageObject{

	// Mapear los objetos.
	// Xphats
	
	public static final Target COMPUTRABAJO_ICONPANEL = Target.the("computrabajo icon Panel").located(By.id("open_menu"));
	public static final Target COMPUTRABAJO_INGRESAR = Target.the("computrabajo INGRESAR").locatedByFirstMatching("/html/body/div[1]/div/div/div[1]/div/div/a[1]");
	public static final Target COMPUTRABAJO_INGRESAR2 = Target.the("computrabajo INGRESAR").located(By.linkText("Ingresar"));
	
	public static final Target COMPUTRABAJO_MAIL = Target.the("computrabajo mail TextBox").located(By.id("LoginModel_Email"));
	public static final Target COMPUTRABAJO_MAIL2 = Target.the("computrabajo mail TextBox").locatedByFirstMatching("//*[@id=\"LoginModel_Email\"]");
	
	public static final Target COMPUTRABAJO_CONTINUAR = Target.the("computrabajo continuar Button").located(By.id("continueWithMailButton"));
	public static final Target COMPUTRABAJO_CONTINUAR2 = Target.the("computrabajo continuar Button").locatedByFirstMatching("//*[@id=\"continueWithMailButton\"]");
	
	public static final Target COMPUTRABAJO_PASSWORD = Target.the("computrabajo password Button").locatedByFirstMatching("/html/body/div[3]/div[2]/div/div/form/div[2]/input");
	public static final Target COMPUTRABAJO_PASSWORD2 = Target.the("computrabajo password Button").located(By.id("LoginModel_Password"));
	
	public static final Target COMPUTRABAJO_INICIARSESION = Target.the("computrabajo Iniciar Button").locatedByFirstMatching("/html/body/div[3]/div[2]/div/div/form/div[2]/a[2]");
	public static final Target COMPUTRABAJO_INICIARSESION2 = Target.the("computrabajo Iniciar Button").located(By.id("btnSubmitPass"));
	
	public static final Target COMPUTRABAJO_USER = Target.the("computrabajo User LSBRL").located(By.id("usernamehj"));
	
	public static final Target COMPUTRABAJO_HOJAVIDA = Target.the("computrabajo Hoja de Vida BUTTON").locatedByFirstMatching("//*[@id=\"secMenu\"]/div/ul/li[2]/a");
	
	//*[@id="open_menu"]
	
}
