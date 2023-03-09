package ZadanieZaliczeniowe2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/Features/ZadanieZaliczeniowe2/ZadanieZaliczeniowe2.feature",
        plugin = {"pretty", "html:report/result2.html"})

public class BuyNewItemTest {
}