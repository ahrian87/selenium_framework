package tests;

import org.testng.annotations.Test;
import page.objects.BasicExamplesPage;
import page.objects.LandingPage;
import page.objects.SimpleFormPage;

import static org.testng.Assert.assertEquals;

public class SimpleFormTests extends TestBase{
    @Test
    public void fillingSimpleFormWithBasicTextTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnStartButton();

        BasicExamplesPage basicExamplesPage = new BasicExamplesPage();
        basicExamplesPage.clickSimpleFormDemoButton();

        SimpleFormPage simpleFormPage = new SimpleFormPage();
        simpleFormPage.typeIntoInputMessageField("hello world");
        simpleFormPage.clickShowMessageButton();

        String message = simpleFormPage.getMessage();

        assertEquals(message, "hello world");
    }

    @Test
    public void fillingTwoInputFieldsFormTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnStartButton();

        BasicExamplesPage basicExamplesPage = new BasicExamplesPage();
        basicExamplesPage.clickSimpleFormDemoButton();

        SimpleFormPage simpleFormPage = new SimpleFormPage();
        simpleFormPage.typeIntoEnterAInputField("2");
        simpleFormPage.typeIntoEnterBInputField("3");

        simpleFormPage.clickGetTotalButton();
        String totalValue = simpleFormPage.getTotalValue();

        assertEquals(totalValue, "5");
    }
}
