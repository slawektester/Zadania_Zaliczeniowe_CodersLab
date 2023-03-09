package ZadanieZaliczeniowe2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Screenshot {

    private WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void MakeScreenshot()  throws IOException{
        File orderConfirmation = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(orderConfirmation, new File("C:/Users/slawe/OneDrive/Obrazy/Order_Confirmation.png"));
    }
}