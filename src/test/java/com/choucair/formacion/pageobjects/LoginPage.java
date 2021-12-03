package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://zero.webappsecurity.com/login.html")
public class LoginPage extends PageObject {

	@FindBy(id="user_login")
	public WebElementFacade txtLogin;
	
	@FindBy(id="user_password")
	public WebElementFacade txtPassword;
	
	@FindBy(name="submit")
	public WebElementFacade btnSignIn;
	
	@FindBy(id="details-button")
	public WebElementFacade btnAvanzado;
	
	@FindBy(id="proceed-link")
	public WebElementFacade lnkContinuar;		
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div/div/h2[1]")
	public WebElementFacade lblTituloHomePage;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/div[1]")
	public WebElementFacade lblError;
	
	public void ingresarDatos(String strUser, String strPassword) {
		txtLogin.sendKeys(strUser);
		txtPassword.sendKeys(strPassword);
	}
	
	public void clicBtnSignIn() {
		btnSignIn.click();		
	}
	
	public void confirmarOpcAvanzado() {
		if(btnAvanzado.isVisible()) {
			btnAvanzado.click();
			lnkContinuar.click();
		}		
	}
	
	public void verificarIngreso() {
		String lblTituloPage = "Cash Accounts";
		String strMensaje = lblTituloHomePage.getText();
		assertThat(strMensaje, containsString(lblTituloPage));
	}
	
	public void verificarCredencialesNoValidas() {
		String lblTextoError = "Login and/or password are wrong.";
		String strMensajeError = lblError.getText();
		assertThat(strMensajeError, containsString(lblTextoError));
	}
	
	public void inicioSesion(String strUser, String strPassword) {
		ingresarDatos(strUser,strPassword);
		clicBtnSignIn();
		confirmarOpcAvanzado();
		verificarIngreso();
	}
	
}
