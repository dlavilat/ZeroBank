#Autor: davilat@choucairtesting.com
#Fecha: Dic-3-2021

@TransferMoney
Feature: Transferencia de dinero
  Como usuario puedo realizar transferencias y pagos desde cualquiera de mis cuentas
  
  Background: 
  	#Given como usuario me encuentro logueado en la aplicacion Zero Bank con user "username" y password "password"
  	Given como usuario me encuentro logueado en la aplicacion Zero Bank con 
  	|user| password |
  	|username|password|

  @Caso1
  Scenario Outline: Cuenta de origen con saldo y monto a enviar positivo
    Given Me dirijo a la opción Transfer Funds
    When Diligencio los datos del formulario <from>,<to>,<amount>,<description>
    And Presiono la opción continuar
    And Envió la verificación de la transaccion
    Then La transacción es satisfactoria
    
    Examples:
    | from 	 | to						| amount  | description 							 	 |
    | "Loan" | "Credit Card" | 100			| "transferencia a Credit Card"|
    


