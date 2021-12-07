#Autor: davilat@choucairtesting.com
#Fecha: Dic-6-2021

@PaySavedPayee
Feature: Realizar pagos a los beneficiarios
  Como usuario puedo realizar pagos a los beneficiarios inscritos, con cualquiera de las cuentas.
  
  Background: 
  	Given como usuario me encuentro logueado en la aplicacion Zero Bank con 
  	|user| password |
  	|username|password|

  @Caso1
  Scenario Outline: Pagar un monto superior al que tiene disponible la cuenta
    Given Me dirijo a la opcion Pay Bills
    When Diligencio los datos del formulario <payee>,<account>,<amount>,<date>,<description>
    And Presiono la opcion pay
    Then El pago no es satisfactorio
    
    Examples:
    | payee	| account| amount | date				| description		|
    |"Apple"| "Loan" | "1500"	| "2021-12-06"| "Pago Factura"|
    

  @Caso2
  Scenario Outline: Pagar un monto menor o igual al que tiene disponible la cuenta con fecha actual
    Given Me dirijo a la opcion Pay Bills
    When Diligencio los datos del formulario <payee>,<account>,<amount>,<date>,<description>
    And Presiono la opcion pay
    Then El pago es satisfactorio
    
    Examples:
    | payee	| account| amount | date				| description		|
    |"Apple"| "Loan" | "400"	| "2021-12-07"| "Pago Factura"|
    

  @Caso3
  Scenario Outline: Pagar un monto menor o igual al que tiene disponible la cuenta con fecha pasada
    Given Me dirijo a la opcion Pay Bills
    When Diligencio los datos del formulario <payee>,<account>,<amount>,<date>,<description>
    And Presiono la opcion pay
    Then El pago no es satisfactorio
    
    Examples:
    | payee	| account			| amount | date				| description		|
    |"Apple"| "Loan" 			| "100"	| "2021-12-01"| "Pago Factura"|
    |"Apple"| "Brokerage" | "100"	| "2021-12-03"| "Pago Factura"|
    
 
  @Caso4
  Scenario Outline: Pagar un monto menor o igual al que tiene disponible la cuenta con fecha futura
    Given Me dirijo a la opcion Pay Bills
    When Diligencio los datos del formulario <payee>,<account>,<amount>,<date>,<description>
    And Presiono la opcion pay
    Then El pago es satisfactorio
    
    Examples:
    | payee	| account| amount | date				| description		|
    |"Apple"| "Loan" | "150"	| "2021-12-15"| "Pago Factura"|
    


