package page;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage<HomePage> {

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement menuElements;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement menuForms;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement menuAlertsFrameWindows;

    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement menuWidgets;

    @FindBy(xpath = "//h5[text()='Interactions']")
    private WebElement menuInteractions;

    @FindBy(xpath = "//h5[text()='Book Store Application']")
    private WebElement menuBookStoreApplication;


    public void accessElementsMenu(){
        menuElements.click();
    }

    public void accessFormsMenu(){
        menuForms.click();
    }

    public void accessAlertsFrameWindowsMenu(){
        menuAlertsFrameWindows.click();
    }

    public void accessWidgetsMenu(){
        menuWidgets.click();
    }

    public void accessInteractionsMenu(){
        menuInteractions.click();
    }

    public void accessBookStoreApplicationMenu(){
        menuBookStoreApplication.click();
    }


}
