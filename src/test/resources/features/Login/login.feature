#Autor: davilat@choucairtesting.com
#Fecha: Dic-3-2021

@Regresion
@Login
  Feature: Ingreso de Login
    Como usuario debo ingresar a la aplicacion a través del diligenciamiento de credenciales

  @CasoExitoso
  Scenario Outline: Ingreso exitoso de login
    Given Estoy en el inicio de la aplicacion ZeroBank
    When Diligencio los campos <login> y <password>
    And Presiono el botón Sign In
    Then El sistema permite el ingreso a la aplicacion

    Examples:
    |login | password |
    |username| password|

  @CasoNoExitoso
  Scenario Outline: Ingreso No exitoso de login
    Given Estoy en el inicio de la aplicacion ZeroBank
    When Diligencio los campos <login> y <password>
    And Presiono el botón Sign In
    Then El sistema no permite el ingreso a la aplicacion

    Examples:
    |login|password |
    |davilat|password|