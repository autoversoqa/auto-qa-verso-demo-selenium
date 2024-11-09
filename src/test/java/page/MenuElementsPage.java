package page;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuElementsPage extends BasePage<MenuElementsPage> {

    @FindBy(id = "item-0")
    private WebElement textBoxMenu;

    @FindBy(id = "item-1")
    private WebElement checkBoxMenu;

    @FindBy(id = "item-2")
    private WebElement radioButtonMenu;

    @FindBy(id = "item-3")
    private WebElement webTablesMenu;

    @FindBy(id = "item-4")
    private WebElement buttonsMenu;

    @FindBy(id = "item-5")
    private WebElement linksMenu;

    @FindBy(id = "item-6")
    private WebElement brokenLinksImagesMenu;

    @FindBy(id = "item-7")
    private WebElement uploadDownloadMenu;

    @FindBy(id = "item-8")
    private WebElement dynamicPropertiesMenu;

    public void navigateToTextBoxPage() {
        new HomePage().accessElementsMenu();
        textBoxMenu.click();
    }

    public void navigateToCheckBoxPage() {
        checkBoxMenu.click();
    }

    public void navigateToRadioButtonPage() {
        radioButtonMenu.click();
    }

    public void navigateToWebTablesPage() {
        webTablesMenu.click();
    }

    public void navigateToButtonsPage() {
        buttonsMenu.click();
    }

    public void navigateToLinksPage() {
        linksMenu.click();
    }

    public void navigateToBrokenLinksImagesPage() {
        brokenLinksImagesMenu.click();
    }

    public void navigateToUploadDownloadPage() {
        uploadDownloadMenu.click();
    }

    public void navigateToDynamicPropertiesPage() {
        dynamicPropertiesMenu.click();
    }

}
