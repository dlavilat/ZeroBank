package com.choucair.formacion.pageobjects.payBills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaySavedPayeePage extends PageObject {
	

	private WebElementFacade optPayee;
	
	private WebElementFacade optAccount;
	
	@FindBy(id="sp_amount")
	private WebElementFacade txtAmount;
	
	@FindBy(id="sp_date")
	private WebElementFacade txtDate;
	
	@FindBy(id="sp_description")
	private WebElementFacade txtDescription;
	
	@FindBy(id="pay_saved_payees")
	private WebElementFacade btnPay;
	
	@FindBy(xpath="//*[@id=\"alert_content\"]/span")
	private WebElementFacade lblRespuesta;
	
	@FindBy(xpath="//*[@id=\"ui-tabs-1\"]/h2")
	private WebElementFacade lblTituloPagina;
	
	public void ingresarPayee(String strPayee) {
		optPayee = element(By.xpath("//select[@id='sp_payee']/child::option[contains(text(),'"+strPayee+"')]"));
		optPayee.click();
	}
	
	public void ingresarAcount(String strAcount) {
		optAccount = element(By.xpath("//select[@id='sp_account']/child::option[contains(text(),'"+strAcount+"')]"));
		optAccount.click();
	}
	
	public void ingresarAmount(String strAmount) {
		txtAmount.click();
		txtAmount.clear();
		txtAmount.sendKeys(strAmount);		
	}
	
	public void ingresarDate(String strDate) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(strDate);	
		txtDate.sendKeys(Keys.TAB);
	}
	
	public void ingresarDescripcion(String strDescription) {
		txtDescription.click();
		txtDescription.clear();
		txtDescription.sendKeys(strDescription);
	}
	
	public void clicBtnPay() {
		btnPay.click();
	}
	
	public void validarPaginaPaySaved() {
		String lblTexto= "Make payments to your saved payees";
		String strMensaje= lblTituloPagina.getText();
		assertEquals(lblTexto, strMensaje);
	}
	
	public void validarPagoExitoso() {
		String lblTexto = "The payment was successfully submitted.";
		String strMensaje = lblRespuesta.getText();		
		assertEquals(lblTexto, strMensaje);
	}
	
	public void validarPagoNoExitoso() {	
		assertNotEquals("The payment was successfully submitted.", lblRespuesta.getText());
	}

}
