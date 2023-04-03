package co.com.prueba.traductor.tasks;

import co.com.prueba.traductor.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private GoogleHomePage googleHomePage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleHomePage));

    }

    public static Abrir LaPaginaDeGoogle() {
        return Tasks.instrumented(Abrir.class);
    }
}
