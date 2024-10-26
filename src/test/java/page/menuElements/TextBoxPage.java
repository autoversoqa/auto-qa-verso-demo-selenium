package page.menuElements;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage<TextBoxPage> {

    @FindBy(css = "h1.text-center")
    private WebElement textBoxTitle;

    @FindBy(id = "userName")
    private WebElement fullNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public String getTextBoxTitleText() {
        return textBoxTitle.getText();
    }

    public void enterFullName(String fullName) {
        fullNameInput.sendKeys(fullName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        currentAddressInput.sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        permanentAddressInput.sendKeys(permanentAddress);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}
