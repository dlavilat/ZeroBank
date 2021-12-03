package com.choucair.formacion.definition;

import com.choucair.formacion.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

	@Steps
	LoginSteps loginSteps;
	
	@Given("^Estoy en el inicio de la aplicacion ZeroBank$")
	public void estoy_en_el_inicio_de_la_aplicacion_ZeroBank() {
		loginSteps.abrirNavegador();
	}

	@When("^Diligencio los campos (.*) y (.*)$")
	public void diligencio_los_campos_correctos(String strUser, String strPassword) {
		loginSteps.login(strUser, strPassword);
	}

	@When("^Presiono el botón Sign In$")
	public void presiono_el_botón_Sign_In() {
		loginSteps.ingresar();
	}
	
	@When("^Doy permiso de acceso al navegador$")
	public void doy_permiso_de_accesp_al_navegador() {
		loginSteps.darPermisosNavegador();
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
