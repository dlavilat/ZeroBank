package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage;
	
	@Step
	public void abrirNavegador() {
		loginPage.open();
	}
	
	@Step
	public void login(String user, String password) {		
		loginPage.ingresarDatos(user, password);		
	}
	
	@Step
	public void ingresar() {
		loginPage.clicBtnSignIn();		
	}
	
	@Step
	public void darPermisosNavegador() {
		loginPage.confirmarOpcAvanzado();	
	}
	
	@Step
	public void verificarIngreso() {
		loginPage.verificarIngreso();
	}
	
	@Step
	public void verificarCredencialesErradas() {
		loginPage.verificarCredencialesNoValidas();
	}
	
	@Step
	public void iniciarSesion(String strUser, String strPassword) {
		abrirNavegador();
		loginPage.inicioSesion(strUser, strPassword);
	}
}