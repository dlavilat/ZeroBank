#Autor: davilat@choucairtesting.com

@Login
  Feature: Ingreso de Login
    Como usuario debo ingresar a la aplicacion a través del diligenciamiento de credenciales

  @CasoExitoso
  Scenario Outline: Ingreso exitoso de login
    Given Estoy en el inicio de la aplicacion ZeroBank
    When Diligencio los campos <login> y <password>
    And Presiono el botón Sign In
    And Doy permiso de acceso al navegador
    Then El sistema permite el ingreso a la aplicacion

    Examples:
    |login | password |
    |username| password|

  @CasoNoExitoso
  Scenario Outline: Ingreso No exitoso de login
    Given Estoy en el inicio de la aplicacion ZeroBank
    When Diligencio los campos <login> y <password>
    And Presiono el botón Sign In
    And Doy permiso de acceso al navegador
    Then El sistema no permite el ingreso a la aplicacion

    Examples:
    |login|password |
    |davilat|password|