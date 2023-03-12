package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAddressesPage {
    private WebDriver driver;

    public CreateNewAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-alias")
    private WebElement aliasInput;

    @FindBy(id = "field-address1")
    private WebElement addressInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-postcode")
    private WebElement postalInput;

    @FindBy(id = "field-phone")
    private WebElement phoneInput;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div/div/form/footer/button")
    private WebElement saveButton;

    public void AddNewAddresses(String alias, String address, String city, String postalcode, String phonenumber) {
        aliasInput.clear();
        aliasInput.sendKeys(alias);
        addressInput.clear();
        addressInput.sendKeys(address);
        cityInput.clear();
        cityInput.sendKeys(city);
        postalInput.clear();
        postalInput.sendKeys(postalcode);
        phoneInput.clear();
        phoneInput.sendKeys(phonenumber);
        saveButton.click();
    }
}