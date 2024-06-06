package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginTest extends BaseTest {
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return ExcelUtils.getData("src/main/resources/testData.xlsx", "Sheet2");
	}
	@Test(dataProvider = "loginData")
	public void testUserLogin(String email, String password) {
		HomePage homePage = new HomePage(driver);
		homePage.clickLogin();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginUser(email , password);
	}
}
