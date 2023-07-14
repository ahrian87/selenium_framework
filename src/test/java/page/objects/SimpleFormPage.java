package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class SimpleFormPage {

    @FindBy(css=".form-group #user-message")
    WebElement inputMessageField;

    @FindBy(xpath="//form[@id='get-input']/button")
    WebElement showMessageButton;

    @FindBy(xpath="//div[@id='user-message']/span")
    WebElement showMessageValue;

    @FindBy(css="input[name='sum1']")
    WebElement enterAInputField;

    @FindBy(css="input[name='sum2']")
    WebElement enterBInputField;

    @FindBy(css="button[class='btn btn-primary'][onclick='return total()']")
    WebElement getTotalButton;

    @FindBy(css="#displayvalue")
    WebElement totalValueMessage;


    public SimpleFormPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoInputMessageField(String message) {
        WaitForElement.waitUntilElementIsVisible(inputMessageField);
        inputMessageField.sendKeys(message);
    }

    public void clickShowMessageButton() {
        WaitForElement.waitUntilElementIsClickable(showMessageButton);
        showMessageButton.click();
    }

    public String getMessage() {
        WaitForElement.waitUntilElementIsVisible(showMessageValue);
        String message = showMessageValue.getText();
        return message;
    }

    public void typeIntoEnterAInputField(String aInput) {
        WaitForElement.waitUntilElementIsVisible(enterAInputField);
        enterAInputField.sendKeys(aInput);
    }

    public void typeIntoEnterBInputField(String bInput) {
        WaitForElement.waitUntilElementIsVisible(enterBInputField);
        enterBInputField.sendKeys(bInput);
    }

    public void clickGetTotalButton() {
        WaitForElement.waitUntilElementIsClickable(getTotalButton);
        getTotalButton.click();
    }

    public String getTotalValue() {
        WaitForElement.waitUntilElementIsVisible(totalValueMessage);
        String totalValue = totalValueMessage.getText();
        return totalValue;
    }

}
