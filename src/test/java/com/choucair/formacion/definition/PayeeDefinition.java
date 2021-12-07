package com.choucair.formacion.definition;

import com.choucair.formacion.steps.payBills.PayeeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PayeeDefinition {	
	
	@Steps
	PayeeSteps payeeSteps;
	
	@Given("^Me dirijo a la opcion Add New Payee$")
	public void me_dirijo_a_la_opcion_Add_New_Payee() {
		payeeSteps.ingresarNewPayee();
	}

	@When("^Diligencio los datos del formulario New Payee \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void diligencio_los_datos_del_formulario_New_Payee(String strName, String strAddress, String strAccount, String strDetails) {
		payeeSteps.ingresarDatos(strName, strAddress, strAccount, strDetails);
	}

	@When("^Presiono el boton Add$")
	public void presiono_el_boton_Add() {
		payeeSteps.clicBtnAdd();
	}

	@Then("^Se crea el nuevo beneficiario$")
	public void se_crea_el_nuevo_beneficiario() {
		payeeSteps.validarCreacionExitosa();
	}
	
	@Then("^No se crea el nuevo beneficiario$")
	public void no_se_crea_el_nuevo_beneficiario() {
		payeeSteps.validarCreacionNoExitoso();
	}

}
