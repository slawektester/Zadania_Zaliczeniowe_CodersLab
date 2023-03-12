package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationAddressesPage {
    private WebDriver driver;

    public VerificationAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/h4")
    private WebElement addressesData;

    public String AddressesData(){
        return addressesData.getText();
    }
}