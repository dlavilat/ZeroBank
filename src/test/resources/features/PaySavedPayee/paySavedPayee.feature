#Autor: davilat@choucairtesting.com
#Fecha: Dic-6-2021

@PaySavedPayee
Feature: Realizar pagos a los beneficiarios
  Como usuario puedo realizar pagos a los beneficiarios inscritos, con cualquiera de las cuentas.
  
  Background: 
  	#Given como usuario me encuentro logueado en la aplicacion Zero Bank con user "username" y password "password"
  	Given como usuario me encuentro logueado en la aplicacion Zero Bank con 
  	|user| password |
  	|username|password|

  @Caso1
  Scenario: Pagar un monto superior al que tiene disponible la cuenta
    Given Me dirijo a la opción Pay Bills
    When Diligencio los datos del formulario <payee>,<account>,<amount>,<date>,<description>
    And Presiono la opcion pay
    Then El pago es satisfactorio


