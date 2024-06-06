package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.ExcelUtils;

public class RegistrationTest extends BaseTest {

	@DataProvider(name = "registrationData")
	public Object[][] getRegistrationData() {
		return ExcelUtils.getData("src/main/resources/testData.xlsx", "Sheet1");
	}
	@Test(dataProvider = "registrationData")
	public void testUserRegistration(String firstName, String lastName, String email, String password)  {
		HomePage homePage = new HomePage(driver);
		homePage.clickRegister();
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.registerUser(firstName, lastName, email, password);

	}


}
