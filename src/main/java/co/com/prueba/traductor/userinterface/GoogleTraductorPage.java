package co.com.prueba.traductor.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraductorPage{
    public static final Target OPCION_INGLES = Target.the("opcion Ingles").locatedBy("//*[@id=\"i8\"]/span[3]");

    public static final Target OPCION_ESPANNOL = Target.the("El segundo idioma").locatedBy("//*[@id=\"i11\"]/span[3]");

    public static final Target AREA_DE_TRADUCCION = Target.the("El lugar donde se escriben las palabras a traducir").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea");

    public static final Target AREA_TRADUCIDA = Target.the("El area donde ya se presenta la palabra traducida").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[2]/div/div[1]");
}
