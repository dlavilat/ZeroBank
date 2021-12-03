package com.choucair.formacion.steps;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import com.choucair.formacion.pageobjects.TransferMoneyPage;

import net.thucydides.core.annotations.Step;

public class TransferMoneySteps {
	
	TransferMoneyPage transferMoney;
	
	@Step
	public void ingresarTransferFunds() {
		transferMoney.clicTransfer();
	}
	
	@Step
	public void ingresarDatos(String strFromAccount,String strToAccount, int strAmount) {
		transferMoney.selectFromAccount(strFromAccount);
		transferMoney.selectToAccount(strToAccount);
		transferMoney.ingresarAmountAndDescription(strAmount);
	}

}
