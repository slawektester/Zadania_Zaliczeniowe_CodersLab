package ZadanieZaliczeniowe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button")
    private WebElement addToCartButton;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityInput;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedToCheckoutButton;

    public void AddItemToCart(String size, String quantity){

        Select drpSize = new Select(driver.findElement(By.id("group_1")));
        drpSize.selectByVisibleText(size);
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
        addToCartButton.click();
        proceedToCheckoutButton.click();
    }
}