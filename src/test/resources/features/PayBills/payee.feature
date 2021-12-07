#Autor: davilat@choucairtesting.com
#Fecha: Dic-7-2021

@Payee
Feature: Crear un nuevo Beneficiario
  Como usuario puedo crear nuevos beneficiarios para pagar facturas

  Background: 
  	Given como usuario me encuentro logueado en la aplicacion Zero Bank con 
  	|user| password |
  	|username|password|
  	
  @Caso1
  Scenario Outline: Diligenciar formulario de creación correctamente
    Given Me dirijo a la opcion Add New Payee
    When Diligencio los datos del formulario New Payee <name>,<address>,<acount>,<details>
    And Presiono el boton Add
    Then Se crea el nuevo beneficiario

    Examples: 
    | name  			| address 		 | acount  					 | details  |
    | "Falabella" | "Cali - WTC" | "12119415161219"  | "Viajes" |
    

  @Caso2
  Scenario Outline: Diligenciar formulario de creación incorrectamente
    Given Me dirijo a la opcion Add New Payee
    When Diligencio los datos del formulario New Payee <name>,<address>,<acount>,<details>
    And Presiono el boton Add
    Then No se crea el nuevo beneficiario

    Examples: 
    | name  			  | address 		 | acount  					 | details  |
    | "Bancolombia" | "Cali - ATC" | "Andf*-.dfsd"     | "Viajes" |
    
    