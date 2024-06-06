package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage{
    WebDriver driver;

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegister() {
        driver.findElement(registerLink).click();
    }

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }
}
