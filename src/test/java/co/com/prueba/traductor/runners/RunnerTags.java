package co.com.prueba.traductor.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/traductorGoogle.feature",
        tags= "@Caso1",
        glue= "co.com.prueba.traductor.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
