package ZadanieZaliczeniowe1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    @When("user goes to their account")

    public void AddNewAddress() {
        MainPage mainPage = new MainPage(driver);
        mainPage.SignInClick();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.AuthenticationVerifacte("slawek@test.pl", "slawek");

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.MyAccountAddress();

        NewAddressesPage newAddressesPage = new NewAddressesPage(driver);
        newAddressesPage.ClickNewAddressButton();
    }
    @Then("user add new address with {}, {}, {}, {}, {} and delete them")

    public void CheckAndDeleteAddress(String alias, String address, String city, String postalcode, String phonenumber){

        CreateNewAddressesPage createNewAddressesPage = new CreateNewAddressesPage(driver);
        createNewAddressesPage.AddNewAddresses(alias, address, city, postalcode, phonenumber);

        VerificationAddressesPage verificationAddressesPage = new VerificationAddressesPage(driver);
        Assert.assertEquals(alias, verificationAddressesPage.AddressesData());

        DelateAddressPage delateAddressPage = new DelateAddressPage(driver);
        delateAddressPage.DeleteAccount();

        DeletedAddressesVerificatePage deletedAddressesVerificatePage = new DeletedAddressesVerificatePage(driver);
        Assert.assertEquals("Address successfully deleted!", deletedAddressesVerificatePage.DeleteMessege());
    }
}