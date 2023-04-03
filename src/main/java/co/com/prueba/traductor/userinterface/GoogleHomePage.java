package co.com.prueba.traductor.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {
public static final Target BOTON_APLICACIONES = Target.the("El boton que muestra las aplicaciones").located(By.xpath("//a[@class='gb_e']"));
public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Botón de app traductor").located(By.xpath("//span[@class= 'MrEfLc' and @style= 'background-position: 0 -2346px;']"));
}
