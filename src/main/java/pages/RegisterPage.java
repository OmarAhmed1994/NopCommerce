package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage  {
    WebDriver driver;
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;

    }

    public void registerUser(String fName, String lName, String email, String pwd)  {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmPassword).sendKeys(pwd);
        driver.findElement(registerButton).click();
    }
}
