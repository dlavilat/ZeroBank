package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (features = "src/test/resources/features/PaySavedPayee/paySavedPayee.feature", tags = "@Caso4")
//@CucumberOptions (features = "src/test/resources/features/TransferMoney/transferMoney.feature", tags = "@TransferMoney")
public class RunnerTags {

}
