package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class BasicExamplesPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(css="a[href='./basic-first-form-demo.html'][class='list-group-item']")
    private WebElement simpleFormDemoButton;

    @FindBy(css="a[href='./basic-checkbox-demo.html'][class='list-group-item']")
    private WebElement checkBoxDemoButton;

    @FindBy(css="a[href='./basic-radiobutton-demo.html'][class='list-group-item']")
    private WebElement radioButtonsDemoButton;

    @FindBy(css="a[href='./basic-select-dropdown-demo.html'][class='list-group-item']")
    private WebElement selectDropdownListButton;

    @FindBy(css="a[href='./javascript-alert-box-demo.html'][class='list-group-item']")
    private WebElement javascriptAlertsButton;

    @FindBy(css="a[href='./window-popup-modal-demo.html'][class='list-group-item']")
    private WebElement windowPopupModalButton;

    @FindBy(css="a[href='./bootstrap-alert-messages-demo.html'][class='list-group-item']")
    private WebElement bootstrapAlertsButton;

    @FindBy(css="a[href='./bootstrap-modal-demo.html'][class='list-group-item']")
    private WebElement bootstrapModalsButton;


    public BasicExamplesPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public SimpleFormPage clickSimpleFormDemoButton() {
        WaitForElement.waitUntilElementIsClickable(simpleFormDemoButton);
        simpleFormDemoButton.click();
        logger.info("Clicked on Simple Form Demo button");
        return new SimpleFormPage();
    }

    public CheckboxPage clickCheckBoxDemoButton() {
        WaitForElement.waitUntilElementIsClickable(checkBoxDemoButton);
        checkBoxDemoButton.click();
        logger.info("Clicked on Check Box Demo button");
        return new CheckboxPage();
    }

    public RadioButtonsPage clickRadioButtonsDemoButton() {
        WaitForElement.waitUntilElementIsClickable(radioButtonsDemoButton);
        radioButtonsDemoButton.click();
        logger.info("Clicked on Radio Buttons Demo button");
        return new RadioButtonsPage();
    }

    public SelectDropdownPage clickSelectDropdownListButton() {
        WaitForElement.waitUntilElementIsClickable(selectDropdownListButton);
        selectDropdownListButton.click();
        logger.info("Clicked on Select Dropdown List button");
        return new SelectDropdownPage();
    }

    public JavaScriptAlertsPage clickJavascriptAlertsButton() {
        WaitForElement.waitUntilElementIsClickable(javascriptAlertsButton);
        javascriptAlertsButton.click();
        logger.info("Clicked on Javascript Alerts button");
        return new JavaScriptAlertsPage();
    }

    public BootstrapAlertsPage clickBootstrapAlertsButton() {
        WaitForElement.waitUntilElementIsClickable(bootstrapAlertsButton);
        bootstrapAlertsButton.click();
        logger.info("Clicked on Bootstrap Alerts button");
        return new BootstrapAlertsPage();
    }
}
