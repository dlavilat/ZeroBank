package com.choucair.formacion.pageobjects.transfer;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfirmTransferPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"transfer_funds_content\"]/div/div/div[1]")
	private WebElementFacade lblConfirm;
	
	public void validarPagina() {
		String lblTexto = "You successfully submitted your transaction.";
		String strMensaje = lblConfirm.getText();
		
		assertThat(strMensaje, containsString(lblTexto));
	}

}
