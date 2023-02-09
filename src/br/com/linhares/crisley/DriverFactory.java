package br.com.linhares.crisley;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>(){
        @Override
        protected synchronized WebDriver initialValue() {
            return initDriver();
        }
    };

    private DriverFactory(){
    }

    public static WebDriver getDriver(){
        return threadDriver.get();
    }

    public static WebDriver initDriver(){
        WebDriver driver = null;
        if(Properties.EXECUTION_TYPE == Properties.ExecutionType.LOCAL){
            switch(Properties.BROWSER){
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void killDriver(){
        WebDriver driver = getDriver();
        if(driver != null){
            driver.quit();
            driver = null;
        }
        if(threadDriver != null){
            threadDriver.remove();
        }
    }
}

