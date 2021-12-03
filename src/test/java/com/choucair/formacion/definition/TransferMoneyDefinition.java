package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.LoginSteps;
import com.choucair.formacion.steps.TransferMoneySteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TransferMoneyDefinition {
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	TransferMoneySteps transferMoney;
	
	@Given("^como usuario me encuentro logueado en la aplicacion Zero Bank con$")
	public void como_usuario_me_encuentro_logueado_en_la_aplicacion_Zero_Bank(DataTable datosSesion) {
		List<List<String>> data = datosSesion.raw();
		loginSteps.iniciarSesion(data.get(1).get(0).toString(), data.get(1).get(1).toString());
	}

	@Given("^Me dirijo a la opción Transfer Funds$")
	public void me_dirijo_a_la_opción_Transfer_Funds() {
		transferMoney.ingresarTransferFunds();
	}

	@When("^Diligencio los datos del formulario \"([^\"]*)\",\"([^\"]*)\",(\\d+),\"([^\"]*)\"$")
	public void diligencio_los_datos_del_formulario_Loan_Credit_Card_descripion(String strFromAccount, String strToAccount, int intAmount, String strDescription) {
		System.out.println("from "+strFromAccount);
		transferMoney.ingresarDatos(strFromAccount,strToAccount,intAmount);
	}

	@When("^Presiono la opción continuar$")
	public void presiono_la_opción_continuar() {
		
	}

	@When("^Envió la verificación de la transaccion$")
	public void envió_la_verificación_de_la_transaccion() {
		
	}

	@Then("^La transacción es satisfactoria$")
	public void la_transacción_es_satisfactoria()  {
		
	}

}
