package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressesPage {

    private WebDriver driver;

    public NewAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://mystore-testlab.coderslab.pl/index.php?controller=address']")
    private WebElement addNewAddressButton;

    public void ClickNewAddressButton(){
        addNewAddressButton.click();
    }
}