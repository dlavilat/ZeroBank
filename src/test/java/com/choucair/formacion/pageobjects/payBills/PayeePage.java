package com.choucair.formacion.pageobjects.payBills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PayeePage extends PageObject {
	
	@FindBy(id="np_new_payee_name")
	private WebElementFacade txtName;
	
	@FindBy(id="np_new_payee_address")
	private WebElementFacade txtAddress;
	
	@FindBy(id="np_new_payee_account")
	private WebElementFacade txtAccount;
	
	@FindBy(id="np_new_payee_details")
	private WebElementFacade txtDetails;
	
	@FindBy(id="add_new_payee")
	private WebElementFacade btnAdd;
	
	@FindBy(id="alert_content")
	private WebElementFacade lblMensaje;
	
	@FindBy(xpath="//*[@id=\"ui-tabs-2\"]/h2")
	private WebElementFacade lblTituloPagina;
	
	public void ingresarName(String strName) {
		txtName.click();
		txtName.clear();
		txtName.sendKeys(strName);
	}
	
	public void ingresarAddress(String strAddress) {
		txtAddress.click();
		txtAddress.clear();
		txtAddress.sendKeys(strAddress);
	}
	
	public void ingresarAccount(String strAccount) {
		txtAccount.click();
		txtAccount.clear();
		txtAccount.sendKeys(strAccount);
	}
	
	public void ingresarDetails(String strDetails) {
		txtDetails.click();
		txtDetails.clear();
		txtDetails.sendKeys(strDetails);
	}
	
	public void ingresarDatos(String strName, String strAddress, String strAccount, String strDetails) {
		ingresarName(strName);
		ingresarAddress(strAddress);
		ingresarAccount(strAccount);
		ingresarDetails(strDetails);
	}
	
	public void clicBtnAdd() {
		btnAdd.click();
	}
	
	public void validarMensajeExitoso() {	
		assertTrue(lblMensaje.isDisplayed());
	}
	
	public void validarDivNoExitoso() {
		assertFalse(lblMensaje.isDisplayed());
	}
	
	public void validarPaginaPayee() {
		String lblTexto= "Who are you paying?";
		String strMensaje= lblTituloPagina.getText();
		assertEquals(lblTexto, strMensaje);
	}

}
