package ZadanieZaliczeniowe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedToOrderButton;

    @FindBy(xpath = "/html/body/main/section/div/div/section/div/div[1]/section[2]/div/div/form/div[2]/button")
    private WebElement addressContinueButton;

    @FindBy(xpath = "/html/body/main/section/div/div/section/div/div[1]/section[3]/div/div[2]/form/button")
    private WebElement shippingMethodContinueButton;

    @FindBy(id = "payment-option-1")
    private WebElement paymentButton;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsAcceptationButton;

    @FindBy(xpath = "/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button")
    private WebElement placeOrderButton;

    public void PlaneAnOrder(){
        proceedToOrderButton.click();
        addressContinueButton.click();
        shippingMethodContinueButton.click();
        paymentButton.click();
        termsAcceptationButton.click();
        placeOrderButton.click();;
    }
}