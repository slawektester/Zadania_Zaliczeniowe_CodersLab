package ZadanieZaliczeniowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedAddressesVerificatePage {

    private WebDriver driver;

    public DeletedAddressesVerificatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/aside/div/article/ul/li")
    private WebElement deletedMessege;

    public String DeleteMessege(){
        return deletedMessege.getText();
    }
}