package com.choucair.formacion;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/", tags = "@Regresion")
//@CucumberOptions (features = "src/test/resources/features/Login/login.feature", tags = "@Login")
//@CucumberOptions (features = "src/test/resources/features/TransferMoney/transferMoney.feature", tags = "@TransferMoney")
//@CucumberOptions (features = "src/test/resources/features/PayBills/paySavedPayee.feature", tags = "@PaySavedPayee")
//@CucumberOptions (features = "src/test/resources/features/PayBills/payee.feature", tags = "@Payee")
public class RunnerTags {

}
