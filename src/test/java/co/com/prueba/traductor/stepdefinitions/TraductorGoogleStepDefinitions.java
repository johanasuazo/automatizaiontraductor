package co.com.prueba.traductor.stepdefinitions;

import co.com.prueba.traductor.tasks.Abrir;
import co.com.prueba.traductor.tasks.Traducir;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TraductorGoogleStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor rafa = Actor.named("Rafa");

    @Before
    public void configuracionInicial(){
        rafa.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^que Rafa quiere usar el traductor de Google$")
    public void que_Rafa_quiere_usar_el_traductor_de_Google() throws Exception {
        rafa.wasAbleTo(Abrir.LaPaginaDeGoogle());

    }

    @When("^el traduce la palabra (.*) de Ingles a Espannol$")
    public void el_traduce_la_palabra_table_de_Ingles_a_Espannol(String palabra) throws Exception {
        rafa.attemptsTo(Traducir.DeInglesAEspannolla(palabra));

    }

    @Then("^el deberia ver la palabra mesa en la pantalla$")
    public void el_deberia_ver_la_palabra_mesa_en_la_pantalla() throws Exception {
    }

}
