package com.choucair.formacion.pageobjects.transfer;

import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.Matchers.containsString;

public class VerifyTransferPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"transfer_funds_content\"]/form/div/div/div[1]/div/p")
	public WebElementFacade lblVerify;
	
	@FindBy(id="btn_submit")
	public WebElementFacade btnSubmit;
	
	public void validarPagina() {
		String lblTexto = "Please verify that the following transaction is correct by selecting the Submit button below.";
		String strMensaje = lblVerify.getText();
		
		assertThat(strMensaje, containsString(lblTexto));
	}
	
	public void clicSubmit() {
		btnSubmit.click();
	}

}
