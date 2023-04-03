#Author: johana.giraldo@konexinnovation.com.co


  Feature: Traductor de Google
    Como usuario
  Quiero ingresar al traductor de Google
  A traducir palabras entre diferntes lenguajes

    @Caso1
  Scenario: Traducir de ingles a Espannol
    Given que Rafa quiere usar el traductor de Google
    When el traduce la palabra table de Ingles a Espannol
    Then el deberia ver la palabra mesa en la pantalla
