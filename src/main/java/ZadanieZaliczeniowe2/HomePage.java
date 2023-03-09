package ZadanieZaliczeniowe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/section/div/div[2]/article/div/ul/li")
    private WebElement discountInformation;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/section/div/div[2]/article/div/div[1]/a/img")
    private WebElement itemPicture;

    public String CheckDiscount(){
        return discountInformation.getText();
    }

    public void GoToItemPage(){
        itemPicture.click();
    }
}