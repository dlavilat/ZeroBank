package com.choucair.formacion.pageobjects.transfer;

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
	
	public void ingresarAmount(int strAmount) {
		txtAmount.click();
		txtAmount.clear();
		txtAmount.sendKeys(Integer.toString(strAmount));		
		
	}
	
	public void ingresarDescripcion(String strDescription) {
		txtDescription.click();
		txtDescription.clear();
		txtDescription.sendKeys(strDescription);
	}
	
	public void clicContinue() {
		btnContinue.click();
	}

}
