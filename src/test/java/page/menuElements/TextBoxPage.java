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

    @FindBy(id = "name")
    private WebElement displayedName;

    @FindBy(id = "email")
    private WebElement displayedEmail;

    @FindBy(xpath = "//p[@id='currentAddress'][1]")
    private WebElement displayedCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress'][1]")
    private WebElement displayedPermanentAddress;

    public String getTextBoxTitleText() {
        return textBoxTitle.getText();
    }

    public TextBoxPage enterFullName(String fullName) {
        fullNameInput.sendKeys(fullName);
        return this;
    }

    public TextBoxPage enterEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public TextBoxPage enterCurrentAddress(String currentAddress) {
        currentAddressInput.sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage enterPermanentAddress(String permanentAddress) {
        permanentAddressInput.sendKeys(permanentAddress);
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getDisplayedName() {
        return displayedName.getText().replace("Name:", "").trim();
    }

    public String getDisplayedEmail() {
        return displayedEmail.getText().replace("Email:", "").trim();
    }

    public String getDisplayedCurrentAddress() {
        return displayedCurrentAddress.getText().replace("Current Address :", "").trim();
    }

    public String getDisplayedPermanentAddress() {
        return displayedPermanentAddress.getText().replace("Permananet Address :", "").trim();
    }

}
