package com.choucair.formacion.steps.payBills;

import com.choucair.formacion.pageobjects.MenuPage;
import com.choucair.formacion.pageobjects.payBills.PaySavedPayeePage;

public class PayBillsSteps {
	
	MenuPage menu;
	PaySavedPayeePage paySavedPayeePage;
	
	public void ingresarMenuPayBill() {
		menu.clicPayBills();
	}
	
	public void ingresarDatos(String strPayee, String strAcount, String strAmount, 
							  String strDate, String strDescription) {
		paySavedPayeePage.validarPaginaPaySaved();
		paySavedPayeePage.ingresarPayee(strPayee);
		paySavedPayeePage.ingresarAcount(strAcount);
		paySavedPayeePage.ingresarAmount(strAmount);
		paySavedPayeePage.ingresarDate(strDate);
		paySavedPayeePage.ingresarDescripcion(strDescription);		
	}
	
	public void presionarBtnPay() {
		paySavedPayeePage.clicBtnPay();
	}
	
	public void validarPagoExitoso() {
		paySavedPayeePage.validarPagoExitoso();
	}
	
	public void validarPagoNoExitoso() {
		paySavedPayeePage.validarPagoNoExitoso();	
	}

}
