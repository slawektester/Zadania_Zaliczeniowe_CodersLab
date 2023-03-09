package ZadanieZaliczeniowe2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class StepsDefs {

    private WebDriver driver;

    @Before
    public void OpenNewBrowserWithTestPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @After
    public void CleanUpAfterTest() {
        driver.quit();
    }

    @When("user add new item to cart and buy them")

    public void BuyNewItem() throws IOException {

        MainPage mainPage = new MainPage(driver);
        mainPage.SignInToAuthorization();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.SignInToAccount("slawek@test.pl", "slawek");

        HomePage homePage = new HomePage(driver);
        Assert.assertEquals("-20%", homePage.CheckDiscount());
        System.out.println("Rabat 20% jest widoczny");

        homePage.GoToItemPage();

        ProductPage productPage = new ProductPage(driver);
        productPage.AddItemToCart("M","5");

        OrderPage orderPage = new OrderPage(driver);
        orderPage.PlaneAnOrder();

        Screenshot screenshot = new Screenshot(driver);
        screenshot.MakeScreenshot();
        System.out.println("Screenshot został zrobiony");
    }
}