package page.menuElements;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage<RadioButtonPage> {

    @FindBy(tagName = "h1")
    private WebElement textRadioButtonTitle;

    @FindBy(id = "yesRadio")
    private WebElement yesRadioButton;

    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadioButton;

    @FindBy(className = "text-success")
    private WebElement successText;

    public void selectYesRadio() {
        if (!yesRadioButton.isSelected()) {
            yesRadioButton.click();
        }
    }

    public void selectImpressiveRadio() {
        if (!impressiveRadioButton.isSelected()) {
            impressiveRadioButton.click();
        }
    }

    public String getSuccessText() {
        return successText.getText();
    }

}
