package base;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage
{
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    public static DriverUtils driverUtils;

    public static void initPages()
    {
       homePage = new HomePage(DriverFactory.driver);
       loginPage = new LoginPage(DriverFactory.driver);
       registerPage = new RegisterPage(DriverFactory.driver);
       driverUtils = new DriverUtils();
    }
}
