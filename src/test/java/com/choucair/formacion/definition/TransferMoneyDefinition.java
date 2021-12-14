package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.LoginSteps;
import com.choucair.formacion.steps.transfer.TransferMoneySteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TransferMoneyDefinition {
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	TransferMoneySteps transferMoney;
	
	@Given("^como usuario me encuentro logueado en la aplicacion Zero Bank con$")
	public void como_usuario_me_encuentro_logueado_en_la_aplicacion_Zero_Bank(DataTable datosSesion) {
		List<List<String>> data = datosSesion.asLists();
		loginSteps.iniciarSesion(data.get(1).get(0).toString(), data.get(1).get(1).toString());
	}

	@Given("^Me dirijo a la opción Transfer Funds$")
	public void me_dirijo_a_la_opción_Transfer_Funds() {
		transferMoney.ingresarTransferFunds();
	}

	@When("^Diligencio los datos del formulario transferencia \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void diligencio_los_datos_del_formulario_transferencia(String strFromAccount, String strToAccount, String strAmount, String strDescription) {
		transferMoney.ingresarDatos(strFromAccount,strToAccount,strAmount,strDescription);
	}

	@When("^Presiono la opción continuar$")
	public void presiono_la_opción_continuar() {
		transferMoney.continuar();
	}

	@When("^Envió la verificación de la transaccion$")
	public void envió_la_verificación_de_la_transaccion() {
		transferMoney.verificarTransaccion();
	}

	@Then("^La transacción es satisfactoria$")
	public void la_transacción_es_satisfactoria()  {
		transferMoney.confirmarEnvio();
	}
	
	@Then("^No se envia a verificacion$")
	public void no_se_envia_a_verificacion() {
		transferMoney.validarPageTransfer();
	}

}
