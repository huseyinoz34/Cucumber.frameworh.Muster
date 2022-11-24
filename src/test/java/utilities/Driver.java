package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

 public static WebDriver driver;

    public static WebDriver getDriver() {
        switch (ConfigReader.getProperties("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }


            return driver;

        }


    }

