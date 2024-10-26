package page.menuElements;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage<CheckBoxPage> {

    @FindBy(tagName = "h1")
    private WebElement textCheckBoxTitle;

    @FindBy(css = "button.rct-option-expand-all")
    private WebElement expandAllButton;

    @FindBy(css = "button.rct-option-collapse-all")
    private WebElement collapseAllButton;

    @FindBy(id = "tree-node-home")
    private WebElement homeCheckbox;

    @FindBy(css = "li.rct-node-parent:nth-of-type(1) button.rct-collapse.rct-collapse-btn")
    private WebElement toggleDesktopButton;

    @FindBy(css = "li.rct-node-parent:nth-of-type(2) button.rct-collapse.rct-collapse-btn")
    private WebElement toggleDocumentsButton;

    @FindBy(css = "li.rct-node-parent:nth-of-type(3) button.rct-collapse.rct-collapse-btn")
    private WebElement toggleDownloadsButton;

    @FindBy(id = "tree-node-desktop")
    private WebElement desktopCheckbox;

    @FindBy(id = "tree-node-documents")
    private WebElement documentsCheckbox;

    @FindBy(id = "tree-node-downloads")
    private WebElement downloadsCheckbox;

    @FindBy(id = "tree-node-notes")
    private WebElement notesCheckbox;

    @FindBy(id = "tree-node-commands")
    private WebElement commandsCheckbox;

    @FindBy(id = "tree-node-wordFile")
    private WebElement wordFileCheckbox;

    @FindBy(id = "tree-node-excelFile")
    private WebElement excelFileCheckbox;

    @FindBy(id = "tree-node-workspace")
    private WebElement workspaceCheckbox;

    @FindBy(id = "tree-node-office")
    private WebElement officeCheckbox;

    public String getCheckBoxTitleText() {
        return textCheckBoxTitle.getText();
    }

    public void clickNotesCheckbox() {
        notesCheckbox.click();
    }

    public void clickExpandAllButton() {
        expandAllButton.click();
    }

    public void clickCollapseAllButton() {
        collapseAllButton.click();
    }

    public void clickHomeCheckbox() {
        homeCheckbox.click();
    }

    public void clickCommandsCheckbox() {
        commandsCheckbox.click();
    }

    public void expandWorkSpace() {
        workspaceCheckbox.click();
    }

    public void expandOffice() {
        officeCheckbox.click();
    }

    public void clickWordFileCheckbox() {
        wordFileCheckbox.click();
    }

    public void clickExcelFileCheckbox() {
        excelFileCheckbox.click();
    }

}
