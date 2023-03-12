package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelateAddressPage {
    private WebDriver driver;

    public DelateAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]/span")
    private WebElement deleteButton;

    public void DeleteAccount() {
        deleteButton.click();
    }
}