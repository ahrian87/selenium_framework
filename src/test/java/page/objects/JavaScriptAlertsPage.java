package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import waits.WaitForElement;

public class JavaScriptAlertsPage {

    private Logger logger = LogManager.getRootLogger();

    Alert alert;

    @FindBy(xpath = "//button[@onclick='myAlertFunction()']")
    WebElement javaScriptAlertBoxButton;

    @FindBy(xpath = "//button[@onclick='myConfirmFunction()']")
    WebElement javaScriptConfirmBoxButton;

    public JavaScriptAlertsPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void waitForAlert() {
        alert = DriverManager.getWebDriver().switchTo().alert();
        WaitForElement.waitUntilAlertIsVisible(alert);
    }

    public void clickJavaScriptAlertBoxButton() {
        WaitForElement.waitUntilElementIsClickable(javaScriptAlertBoxButton);
        javaScriptAlertBoxButton.click();
        logger.info("Click JavaScript Alert Box button");
    }

    public void closeAlertBox() {
        waitForAlert();
        alert.accept();
        logger.info("Close alert box");
    }

    public boolean isAlertVisible() {
        waitForAlert();
        logger.info("Check if alert is displayed");
        return alert.getText() != null;
    }

}
