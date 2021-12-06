package com.choucair.formacion.pageobjects.transfer;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransferMoneyPage extends PageObject{
	
	@FindBy(id="transfer_funds_tab")
	public WebElementFacade lstTransfer;
	
	public WebElementFacade optFromAccount;
	
	public WebElementFacade optToAccount;
	
	@FindBy(id="tf_amount")
	public WebElementFacade txtAmount;
	
	@FindBy(id="tf_description")
	public WebElementFacade txtDescription;
	
	@FindBy(id="btn_submit")
	public WebElementFacade btnContinue;
	
	@FindBy(xpath="//*[@id=\"transfer_funds_content\"]/form/div/div/h2")
	public WebElementFacade lblPageTransfer;
	
	public void clicTransfer() {
		lstTransfer.click();
	}
	
	public void selectFromAccount(String strFromAccount) {
		optFromAccount = element(By.xpath("//select[@id='tf_fromAccountId']/child::option[contains(text(),'"+strFromAccount+"')]"));
		optFromAccount.click();		
	}
	
	public void selectToAccount(String strToAccount) {
		optToAccount = element(By.xpath("//select[@id='tf_toAccountId']/child::option[contains(text(),'"+strToAccount+"')]"));
		optToAccount.click();
	}
	
	public void ingresarAmount(String strAmount) {
		txtAmount.click();
		txtAmount.clear();
		txtAmount.sendKeys(strAmount);		
		
	}
	
	public void ingresarDescripcion(String strDescription) {
		txtDescription.click();
		txtDescription.clear();
		txtDescription.sendKeys(strDescription);
	}
	
	public void clicContinue() {
		btnContinue.click();
	}
	
	public void validarPage() {
		String lblTexto = "Transfer Money & Make Payments";
		String strMensaje = lblPageTransfer.getText();
		
		//assertThat(strMensaje, containsString(lblTexto));
		assertEquals(lblTexto, strMensaje);
	}

}
