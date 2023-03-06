package ZadanieZaliczeniowe1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/Features/ZadanieZaliczeniowe1/ZadanieZaliczeniowe1.feature",
        plugin = {"pretty", "html:report/result.html"})

public class AddNewAddressesTest {
}