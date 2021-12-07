#Autor: davilat@choucairtesting.com
#Fecha: Dic-3-2021

@TransferMoney
Feature: Transferencia de dinero
  Como usuario puedo realizar transferencias y pagos desde cualquiera de mis cuentas
  
  Background:   	
  	Given como usuario me encuentro logueado en la aplicacion Zero Bank con 
  	|user| password |
  	|username|password|

  @Caso1
  Scenario Outline: Cuenta de origen con saldo y el monto a enviar sea positivo
    Given Me dirijo a la opción Transfer Funds
    When Diligencio los datos del formulario <from>,<to>,<amount>,<description>
    And Presiono la opción continuar
    And Envió la verificación de la transaccion
    Then La transacción es satisfactoria
    
    Examples:
    | from 	 | to						 | amount  | description 							 	 |
    | "Loan" | "Credit Card" | "100"	| "transferencia a Credit Card"|
    

  @Caso2
  Scenario Outline: Cuenta de origen con saldo y el monto a enviar sea negativo
    Given Me dirijo a la opción Transfer Funds
    When Diligencio los datos del formulario <from>,<to>,<amount>,<description>
    And Presiono la opción continuar
    Then No se envia a verificacion
    
    Examples:
    | from 	 			| to		 | amount  	| description 							 	 |
    | "Checking"  | "Loan" | "-90"		| "transferencia a Credit Card"|  
    

  @Caso3
  Scenario Outline: Cuenta de origen con saldo y el monto a enviar sea 0
    Given Me dirijo a la opción Transfer Funds
    When Diligencio los datos del formulario <from>,<to>,<amount>,<description>
    And Presiono la opción continuar
    Then No se envia a verificacion
    
    Examples:
    | from 	 			 | to		 			| amount  	| description 						 |
    | "Brokerage"  | "Checking" | "0"		| "transferencia a Credit Card"|  
  
    


