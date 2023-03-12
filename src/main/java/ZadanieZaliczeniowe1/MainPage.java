package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span")
    private WebElement signInButton;

    public void SignInClick() {
        signInButton.click();
    }
}