package utils;

import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class DriverFactory
{
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver()
    {
        prop = new Properties();
        try
        {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        if(prop.getProperty("browserName").equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if(prop.getProperty("browserName").equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        else
        {
            System.out.println("invalid browser name");
        }

        driver.manage().window().maximize();
        BasePage.initPages();


        return driver;
    }




    public static void closeDriver()
    {
        driver.quit();
    }




}
