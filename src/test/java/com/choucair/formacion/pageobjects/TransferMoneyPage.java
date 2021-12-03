package com.choucair.formacion.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import net.bytebuddy.asm.Advice.Enter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.EnterValueIntoElement;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.SelectOptions;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.questions.targets.TargetSelectOptions;
import net.serenitybdd.screenplay.targets.Target;

public class TransferMoneyPage extends PageObject{
	
	@FindBy(id="transfer_funds_tab")
	public WebElementFacade lstTransfer;
	
	//@FindBy(id="tf_fromAccountId")
	public WebElement optFromAccount;
	
	//@FindBy(id="tf_toAccountId")
	public WebElementFacade optToAccount;
	
	@FindBy(id="tf_amount")
	public WebElementFacade txtAmount;
	
	@FindBy(id="tf_description")
	public WebElementFacade txtDescription;
	
	public void clicTransfer() {
		lstTransfer.click();
	}
	
	public void selectFromAccount(String strFromAccount) {
		/*optFromAccount.click();
		optFromAccount.sendKeys(strFromAccount, Keys.ENTER);*/		
		optFromAccount = getDriver().findElement(By.xpath("//*[@id=\"tf_fromAccountId\"]/option[2]"));	
		optFromAccount.click();		
	}
	
	public void selectToAccount(String strToAccount) {
		optToAccount = element(By.xpath("//*[@id=\"tf_toAccountId\"]/option[4]"));
		optToAccount.click();
		//optToAccount.sendKeys(strToAccount, Keys.ENTER);
	}
	
	public void ingresarAmountAndDescription(int strAmount) {
		txtAmount.click();
		txtAmount.clear();
		txtAmount.sendKeys(Integer.toString(strAmount));
	}

}
