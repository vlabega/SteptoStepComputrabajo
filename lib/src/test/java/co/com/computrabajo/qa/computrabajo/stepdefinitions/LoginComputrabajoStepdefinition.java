////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 11 - Crear la clase o refactorizar la calase stepdefinitions. 
// 12 - Adicionar Los stepdefinitions.
// 13 - Importar todos los Parametros. Verificar se encuentren los import de io.cucumber.java
// 14 - Comentar los Throw 
// 15 - Eliminar los Underline
// 17 - Inicializamos el Driver
// 18 - Agregamos el @Managed(driver = "chrome") y lo imporrtamos
// 19 - Importar ek Actor de SerenityBDD
// 20 - Instanciar nuestra Page Inicial
// 21 - BrowseTheWeb de Serenity
// 22 - Crear la primer User Interface
// 23 - Implementar los pasos y tareas del given Actor.wasAbleTo
// 24 - Importar la Task y el Userinterface
// 25 - Creamos el metodo AT en la Clase Task definida.
// 28 - Actualiza el Given con (String name, String webpage) throws Exception 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package co.com.computrabajo.qa.computrabajo.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import co.com.computrabajo.qa.computrabajo.questions.AssertCredentials;
import co.com.computrabajo.qa.computrabajo.tasks.EnterCredentials;
import co.com.computrabajo.qa.computrabajo.tasks.OpenTheAuthenticate;
import co.com.computrabajo.qa.computrabajo.tasks.OpenTheBrowser;
import co.com.computrabajo.qa.computrabajo.tasks.OpenTheCountry;
import co.com.computrabajo.qa.computrabajo.tasks.OpenThePanel;
import co.com.computrabajo.qa.computrabajo.userinterface.CompuTrabajoHomePanel;
import co.com.computrabajo.qa.computrabajo.userinterface.ComputrabajoHomePage;
import co.com.computrabajo.qa.computrabajo.utils.ConsoleMessageUtil;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
//import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import co.com.computrabajo.qa.computrabajo.utils.ScreenshotUtil;


@SuppressWarnings("unused")
public class LoginComputrabajoStepdefinition {
	
	
	    // Inicializamos el Driver
		@Managed(driver = "chrome") // debe estar en la raiz del proyecto
		private WebDriver hisBrowser;
		
		// Instancia el Actor en un nombre de Aator.
		private Actor vlady = Actor.named("Vlady");
		
		
		// Instancia // Instancio otro para abrir
		private ComputrabajoHomePage computrabajoHomePage;
		//private PageObject computrabajoHomePage;
		

		// Metodo para asociar el actor al driver, el actor puede navegar en la web con
		// el driver
		@Before
		public void setup() {
			vlady.can(BrowseTheWeb.with(hisBrowser));
			ScreenshotUtil.init();
		}
	
	

	@Given("that the User want do login in the application")
	public void thattheuserwantdologinintheapplication() throws Exception  {
	   
		//vlady.wasAbleTo(OpenTheBrowser.at(computrabajoHomePage));
		ConsoleMessageUtil.printMessage("maxBrowser");
		hisBrowser.manage().window().maximize();
		
		ConsoleMessageUtil.printMessage("ejecutarGiven");
		vlady.wasAbleTo(OpenTheBrowser.at(computrabajoHomePage));
		// Codigo para ubicar los elementos y llegar al login
		vlady.wasAbleTo(OpenTheCountry.at(null));
		vlady.wasAbleTo(OpenThePanel.at(null));
		ScreenshotUtil.captureScreenshot("login_screen");
	}
	
	/*@When("User enter credentials")
	public void userentercredentials(io.cucumber.datatable.DataTable dataTable) {
	   
		//Se puede realizar de 4 formas el logeo de una aplicacion:
		// 1 - Datos desde el data table del Feature
		// 2 - Datos quemados desde el envio de la informacion en el stepdefinition
		// 3 - Tener los daos almacenados en una Lista de Listas JAva (Data Drivens)
		// 4 - Capturar los datos desde Consola o desde mensajes de textbox
		
		//vlady.attemptsTo(OpenTheAuthenticate.withThe(LoginList));
		//vlady.attemptsTo(OpenTheAuthenticate.withThe(null));
		
		System.out.println("Selecciona opcion Ingresar para autenticar el usuario");
		//hisBrowser.findElement(By.linkText("Ingresar")).click();
		vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INGRESAR2));
		SleepUtil.sleepSeconds(5);
		System.out.println("Ingresa mail del usuario");
		vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL2));
		hisBrowser.findElement(By.id("LoginModel_Email")).sendKeys("vlabega@gmail.com");
		SleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion Continuar");
		vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_CONTINUAR));
		SleepUtil.sleepSeconds(5);
		System.out.println("Ingresar el Password");
		hisBrowser.findElement(By.id("LoginModel_Password")).click();
		hisBrowser.findElement(By.id("LoginModel_Password")).sendKeys("LimaPanama2023*");
		SleepUtil.sleepSeconds(5);
		System.out.println("Seleccionar opcion Iniciar Sesion");
		vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INICIARSESION2));
		//hisBrowser.findElement(By.id("LoginModel_Email")).sendKeys("vlabega@gmail.com");
		SleepUtil.sleepSeconds(5);

		//vlady.attemptsTo(Enter.theValue(vlady.getUsername()).into(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL);
		
		/*
		        // LoginList.add(0, "vlabega@gmail.com");
				// LoginList.add(1, "1234zzzz");

				System.out.println("Captura nuevos datos");
				// JOptionPane.showMessageDialog(null, LoginList.get(1));
				// JOptionPane.showMessageDialog(null, LoginList.get(0));

				// Asignacion de nuevos valores (Esto debe ir en una Clase a parte)
				String usuariomail = JOptionPane.showInputDialog("Introduce Mail Registrado: ");
				LoginList.add(0, usuariomail);
				String password = JOptionPane.showInputDialog("Introduce Password: ");
				LoginList.add(1, password);

				System.out.println("enviala lista para autenticar");
				vlady.attemptsTo(Authenticate.withThe(LoginList));
				Thread.sleep(1000);*/
		
	//} */
	
	/*
	@When("User enter credentials")
	public void userEnterCredentials(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
	    
	    String email = credentials.get(0).get("User");
	    String password = credentials.get(0).get("Password");
	    
	    System.out.println("Selecciona opción Ingresar para autenticar el usuario");
	    vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INGRESAR2));
	    SleepUtil.sleepSeconds(5);
	    
	    System.out.println("Ingresa el correo electrónico del usuario");
	    vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL2));
	    hisBrowser.findElement(By.id("LoginModel_Email")).sendKeys(email);
	    SleepUtil.sleepSeconds(5);
	    
	    System.out.println("Seleccionar opción Continuar");
	    vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_CONTINUAR));
	    SleepUtil.sleepSeconds(5);
	    
	    System.out.println("Ingresar la contraseña");
	    hisBrowser.findElement(By.id("LoginModel_Password")).click();
	    hisBrowser.findElement(By.id("LoginModel_Password")).sendKeys(password);
	    SleepUtil.sleepSeconds(5);
	    
	    System.out.println("Seleccionar opción Iniciar Sesión");
	    vlady.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INICIARSESION2));
	    
	    SleepUtil.sleepSeconds(5);
	}*/

	@When("User enter credentials")
	public void userEnterCredentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
	    vlady.attemptsTo(EnterCredentials.withThe(credentials));
	    
	    SleepUtil.sleepSeconds(5);
	    ScreenshotUtil.captureScreenshot("enter_credentials_screen");
	}
	
	@Then("User should see the oferts country in the screen")
	public void usershouldseetheofertscountryinthescreen() {
	    // Write code here that turns the phrase above into concrete actions
		vlady.attemptsTo(AssertCredentials.Validate(null));
		ScreenshotUtil.captureScreenshot("offers_screen");
        ScreenshotUtil.close();

	}	
	
}
