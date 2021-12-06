package com.choucair.formacion.steps.transfer;

import com.choucair.formacion.pageobjects.transfer.VerifyTransferPage;
import com.choucair.formacion.pageobjects.transfer.ConfirmTransferPage;
import com.choucair.formacion.pageobjects.transfer.TransferMoneyPage;

import net.thucydides.core.annotations.Step;

public class TransferMoneySteps {
	
	TransferMoneyPage transferMoney;
	VerifyTransferPage verifyTransferPage;
	ConfirmTransferPage confirmTransfer;
	
	@Step
	public void ingresarTransferFunds() {
		transferMoney.clicTransfer();
	}
	
	@Step
	public void ingresarDatos(String strFromAccount,String strToAccount, int strAmount, String strDescription) {
		transferMoney.selectFromAccount(strFromAccount);
		transferMoney.selectToAccount(strToAccount);
		transferMoney.ingresarAmount(strAmount);
		transferMoney.ingresarDescripcion(strDescription);
	}
	
	@Step
	public void continuar() {
		transferMoney.clicContinue();
	}
	
	@Step
	public void verificarTransaccion() {
		verifyTransferPage.validarPagina();
		verifyTransferPage.clicSubmit();
	}
	
	@Step
	public void confirmarEnvio() {
		confirmTransfer.validarPagina();
	}
}
