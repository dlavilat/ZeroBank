package com.choucair.formacion.definition;

import com.choucair.formacion.steps.LoginSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

	@Steps
	LoginSteps loginSteps;
	
	@Given("^Estoy en el inicio de la aplicacion ZeroBank$")
	public void estoy_en_el_inicio_de_la_aplicacion_ZeroBank() {
		loginSteps.abrirNavegador();
	}

	@When("^Diligencio los campos (.*) y (.*)$")
	public void diligencio_los_campos(String strUser, String strPassword) {
		loginSteps.login(strUser, strPassword);
	}

	@When("^Presiono el botón Sign In$")
	public void presiono_el_botón_Sign_In() {
		loginSteps.ingresar();
	}

	@Then("^El sistema permite el ingreso a la aplicacion$")
	public void el_sistema_permite_el_ingreso_a_la_aplicacion() {
		loginSteps.verificarIngreso();
	}

	@Then("^El sistema no permite el ingreso a la aplicacion$")
	public void el_sistema_no_permite_el_ingreso_a_la_aplicacion() {
		loginSteps.verificarCredencialesErradas();
	}
}
