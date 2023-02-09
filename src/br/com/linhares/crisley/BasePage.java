package br.com.linhares.crisley;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.linhares.crisley.utils.SleepTime;

import static br.com.linhares.crisley.DriverFactory.getDriver;

public class BasePage {

    public void clickOnButton(By by){
        new WebDriverWait(getDriver(), SleepTime.TEN_SEC).until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public boolean isElementPresent(By by){
        new WebDriverWait(getDriver(), SleepTime.TEN_SEC).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        return true;
    }

    public void writeOnField(By by, String text){
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(text);
    }
}

