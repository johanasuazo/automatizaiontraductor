package co.com.prueba.traductor.tasks;

import co.com.prueba.traductor.userinterface.GoogleHomePage;
import co.com.prueba.traductor.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task {

    private String palabra;

    public Traducir(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_APLICACIONES));
        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_GOOGLE_TRANSLATE));

        actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_INGLES));
        actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_ESPANNOL));
        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraductorPage.AREA_DE_TRADUCCION));


    }

    public static Traducir DeInglesAEspannolla(String palabra) {
        return Tasks.instrumented(Traducir.class, palabra);
    }

}
