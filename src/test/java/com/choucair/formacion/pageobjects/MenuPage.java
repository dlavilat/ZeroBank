package com.choucair.formacion.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends PageObject{

	@FindBy(id="transfer_funds_tab")
	public WebElementFacade lstTransferFunds;
	
	@FindBy(id="pay_bills_tab")
	public WebElementFacade lstPayBills;
	
	@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]")
	public WebElementFacade lstNewPayee;
	
	public void clicTransfer() {
		lstTransferFunds.click();
	}
	
	public void clicPayBills() {
		lstPayBills.click();
	}
	
	public void clicNewPayee() {
		lstNewPayee.click();
	}
}
