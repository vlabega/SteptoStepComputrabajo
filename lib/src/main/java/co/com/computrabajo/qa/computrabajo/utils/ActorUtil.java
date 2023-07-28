package co.com.computrabajo.qa.computrabajo.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ActorUtil {
    private static Actor actor;

    public static Actor getActor() {
        if (actor == null) {
            actor = Actor.named("Vlady");
            actor.can(BrowseTheWeb.with(BrowserUtil.getDriver()));
        }
        return actor;
    }
}
