////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 26 - Agregar @DefaultUrl("https://www.computrabajo.com/")
// 27 - instanciar la clase tipo extends PageObject
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package co.com.computrabajo.qa.computrabajo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.computrabajo.com")
public class ComputrabajoHomePage extends PageObject{

	// Mapear los objetos.
	// Xphats
	
	public static final Target COMPUTRABAJO_LOGO = Target.the("computrabajo logo").locatedByFirstMatching("/html/body/header/div/a/img");
	public static final Target COMPUTRABAJO_LINKPAIS = Target.the("computrabajo link Pais").located(By.id("Colombialink"));
	
	public static final Target COMPUTRABAJO_ICONPANEL = Target.the("computrabajo icon Panel").located(By.id("open_menu"));
	public static final Target COMPUTRABAJO_INGRESAR = Target.the("computrabajo INGRESAR").locatedByFirstMatching("/html/body/div[1]/div/div/div[1]/div/div/a[1]");
	
}
