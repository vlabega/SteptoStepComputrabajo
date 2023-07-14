/*package co.com.computrabajo.qa.computrabajo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.qa.computrabajo.models.CredentialsModel;
import co.com.computrabajo.qa.computrabajo.userinterface.CompuTrabajoHomePanel;
import co.com.computrabajo.qa.computrabajo.utils.ConsoleMessageUtil;
import co.com.computrabajo.qa.computrabajo.utils.SleepUtil;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterCredentials implements Task {
    private List<Map<String, String>> credentials;

    public EnterCredentials(List<Map<String, String>> credentials) {
        this.credentials = credentials;
    }

    public static EnterCredentials withCredentials(List<Map<String, String>> credentials) {
        return Tasks.instrumented(EnterCredentials.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String email = credentials.get(0).get("User");
        String password = credentials.get(0).get("Password");

        ConsoleMessageUtil.printMessage("seleccionarIngresar");

        actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INGRESAR2));
        SleepUtil.sleepSeconds(2);

        ConsoleMessageUtil.printMessage("ingresarCorreo");

        actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL2));
        actor.attemptsTo(Enter.theValue(email).into(CompuTrabajoHomePanel.COMPUTRABAJO_MAIL2));
        SleepUtil.sleepSeconds(2);

        ConsoleMessageUtil.printMessage("seleccionarContinuar");

        actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_CONTINUAR));
        SleepUtil.sleepSeconds(2);

        ConsoleMessageUtil.printMessage("ingresarContraseña");

        actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_PASSWORD2));
        actor.attemptsTo(Enter.theValue(password).into(CompuTrabajoHomePanel.COMPUTRABAJO_PASSWORD2));
        SleepUtil.sleepSeconds(2);

        ConsoleMessageUtil.printMessage("seleccionarIniciarSesion");

        actor.attemptsTo(Click.on(CompuTrabajoHomePanel.COMPUTRABAJO_INICIARSESION2));

        SleepUtil.sleepSeconds(2);
    }

    public static EnterCredentials withThe(List<Map<String, String>> credentials) {
        return instrumented(EnterCredentials.class, credentials);
    }

    public static EnterCredentials withCredentialsModel(CredentialsModel credentialsModel) {
        List<Map<String, String>> credentials = new ArrayList<>();
        Map<String, String> credentialMap = new HashMap<>();
        credentialMap.put("User", credentialsModel.getUser());
        credentialMap.put("Password", credentialsModel.getPassword());
        credentials.add(credentialMap);
        return instrumented(EnterCredentials.class, credentials);
    }
} */
