package com.choucair.formacion.steps.payBills;

import com.choucair.formacion.pageobjects.MenuPage;
import com.choucair.formacion.pageobjects.payBills.PayeePage;

public class PayeeSteps {

	MenuPage menu;
	PayeePage payeePage;
	
	public void ingresarNewPayee() {
		menu.clicPayBills();
		menu.clicNewPayee();
	}
	
	public void ingresarDatos(String strName, String strAddress, String strAccount, String strDetails) {
		payeePage.validarPaginaPayee();
		payeePage.ingresarDatos(strName, strAddress, strAccount, strDetails);
	}
	
	public void clicBtnAdd() {
		payeePage.clicBtnAdd();
	}
	
	public void validarCreacionExitosa() {
		payeePage.validarMensajeExitoso();
	}
	
	public void validarCreacionNoExitoso() {
		payeePage.validarDivNoExitoso();
	}
	
}
