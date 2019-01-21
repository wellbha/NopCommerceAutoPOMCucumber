package nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@registration, @registeredUserMail,  @unregisteredUserMail, @termsCondition, @productPurchase, @sortby")

public class RunTest {

}
