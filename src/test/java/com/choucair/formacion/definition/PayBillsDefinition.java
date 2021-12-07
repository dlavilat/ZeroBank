package com.choucair.formacion.definition;


import com.choucair.formacion.steps.LoginSteps;
import com.choucair.formacion.steps.payBills.PayBillsSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PayBillsDefinition {
	
	@Steps
	LoginSteps loginSteps;
	@Steps
	PayBillsSteps payBillsSteps;
	
	@Given("^Me dirijo a la opcion Pay Bills$")
	public void me_dirijo_a_la_opcion_Pay_Bills() {
		payBillsSteps.ingresarMenuPayBill();
	}

	@When("^Diligencio los datos del formulario \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void diligencio_los_datos_del_formulario(String strPayee, String strAcount, String strAmount, 
													String strDate, String strDescription) {
		payBillsSteps.ingresarDatos(strPayee, strAcount, strAmount, strDate, strDescription);
	}

	@When("^Presiono la opcion pay$")
	public void presiono_la_opcion_pay() {
		payBillsSteps.presionarBtnPay();
	}

	@Then("^El pago no es satisfactorio$")
	public void el_pago_no_es_satisfactorio() {
		payBillsSteps.validarPagoNoExitoso();
	}
	
	@Then("^El pago es satisfactorio$")
	public void el_pago_es_satisfactorio() {
		payBillsSteps.validarPagoExitoso();
	}
}
