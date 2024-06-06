package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;
    By emailLoc = By.id("Email");

    By password =By.id("Password");

    By loginButton =By.xpath("//button[contains(text(),'Log in')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void loginUser(String email, String pwd) {
        driver.findElement(emailLoc).sendKeys(email);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

    }
}
